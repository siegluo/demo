package com.example.demo.socketio.nio.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

/**
 * 多路复用类
 * 它是一个独立的线程，负责轮询多路复器Selector,可以处理多个客户端的并发接入。
 *
 * @date 2017年11月6日下午3:51:41
 */
public class MultiplexerTimeServer implements Runnable {

    private Selector selector;//多路复用器
    private ServerSocketChannel servChannel;
    private volatile boolean stop;

    /**
     * 初始化多路复用器、绑定监听端口
     *
     * @param port
     */
    public MultiplexerTimeServer(int port) {
        try {
            selector = Selector.open();
            servChannel = ServerSocketChannel.open();
            servChannel.configureBlocking(false);
            servChannel.socket().bind(new InetSocketAddress(port), 1024);
            servChannel.register(selector, SelectionKey.OP_ACCEPT);
            System.out.println("The time server is start in port: " + port);

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public void stop() {
        this.stop = true;
    }


    @Override
    public void run() {
        while (!stop) {
            try {
                //设置selector的休眠时间为1s，无论是否有读写等事件发生，selector每隔1s都被唤醒一次。
                selector.select(1000);
                //当有处于就绪状态的Channel时，selector就返回就绪状态的Channel的SelectionKey集合。
                Set<SelectionKey> selectedKeys = selector.selectedKeys();
                Iterator<SelectionKey> it = selectedKeys.iterator();
                SelectionKey key = null;
                //通过对就绪状态的Channel集合进行迭代，可以进行网络的异步读写操作。
                while (it.hasNext()) {
                    key = it.next();
                    it.remove();
                    try {
                        handleInput(key);
                    } catch (Exception e) {
                        if (key != null) {
                            key.cancel();
                            if (key.channel() != null) {
                                key.channel().close();
                            }
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        /*
         * 多路复用器关闭后，所有注册在上面的Channel和Pipe等资源都会被自动去注册并关闭，所以不需要重复释放资源。
         */
        if (selector != null) {
            try {
                selector.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private void handleInput(SelectionKey key) throws IOException {
        if (key.isValid()) {
            //处理新接入的请求消息
            //通过SelectionKey的操作位进行判断即可获知网络事件类型
            if (key.isAcceptable()) {
                //Accept the new connection
                ServerSocketChannel ssc = (ServerSocketChannel) key.channel();
                SocketChannel sc = ssc.accept();
                //-----以上操作相当于完成了TCP的三次握手，TCP物理链路正式建立------

                //将新创建的SocketChannel设置为异步非阻塞，同时也可以对其TCP参数进行设置，例如TCP接收和发送缓冲区的大小等。
                sc.configureBlocking(false);
                //Add the new connection to the selector
                sc.register(selector, SelectionKey.OP_READ);
            }
            if (key.isReadable()) {
                //Read the data
                SocketChannel sc = (SocketChannel) key.channel();
                //由于实现我们得知客户端发送的码流大小，作为例程，我们开辟一个1K的缓冲区
                ByteBuffer readBuffer = ByteBuffer.allocate(1024);
                //由于已经设置SocketChannel为异步非阻塞模式，因此它的read是非阻塞的。
                int readBytes = sc.read(readBuffer);
                /*
                 * readBytes>0  读到了字节，对字节进行编解码；
                 * readBytes=0  没有读取到字节，属于正常场景，忽略；
                 * readByte=-1 链路已经关闭，需要关闭SocketChannel，释放资源
                 */
                if (readBytes > 0) {
                    //将缓冲区当前的limit设置为position，position设置为0，用于后续对缓冲区的读取操作。
                    readBuffer.flip();
                    //根据缓冲区可读的字节个数创建字节数组
                    byte[] bytes = new byte[readBuffer.remaining()];
                    //调用ByteBuffer的get操作将缓冲区可读的字节数组复制到新创建爱你的字节数组中
                    readBuffer.get(bytes);
                    String body = new String(bytes, "UTF-8");
                    System.out.println("The time server receive order: " + body);
                    //如果请求指令是"QUERY TIME ORDER"则把服务器的当前时间编码后返回给客户端
                    String currentTime = "QUERY TIME ORDER".equalsIgnoreCase(body) ? new Date(
                            System.currentTimeMillis()).toString() : "BAD ORDER";

                    doWrite(sc, currentTime);
                } else if (readBytes < 0) {

                    //对端链路关闭
                    key.cancel();
                    sc.close();
                } else {
                    //读到0字节，忽略
                }
            }
        }
    }


    private void doWrite(SocketChannel channel, String response) throws IOException {
        if (response != null && response.trim().length() > 0) {
            byte[] bytes = response.getBytes();
            ByteBuffer writeBuffer = ByteBuffer.allocate(bytes.length);
            //调用ByteBuffer的put操作将字节数组复制到缓冲区
            writeBuffer.put(bytes);
            writeBuffer.flip();
            channel.write(writeBuffer);

            /*
             * 需要指出的是，由于SocketChannel是异步非阻塞的，它并不保证一次性能够把需要发送的字节数组发送完，
             * 此时会出现“写半包”问题，我们需要注册写操作，不断轮询Selector，将没有发送完毕的ByteBuffer发送完毕，
             * 可以通过ByteBuffer的hasRemaining()方法判断消息是否发送完成。
             * 此处仅仅是各简单的入门级例程，没有演示如何处理“写半包”场景，后面会说到。
             */
        }
    }
}