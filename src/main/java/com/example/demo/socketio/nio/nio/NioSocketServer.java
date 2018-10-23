package com.example.demo.socketio.nio.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class NioSocketServer extends Thread {
    ServerSocketChannel serverSocketChannel = null;
    Selector selector = null;
    SelectionKey selectionKey = null;
    // 缓存一个read事件中一个不完整的包，以待下次read事件到来时拼接成完整的包
    ByteBuffer cacheBuffer = ByteBuffer.allocate(100);
    boolean cache = false;
    public void initServer() throws IOException {
        selector = Selector.open();
        serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.socket().bind(new InetSocketAddress(8888));
        selectionKey = serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
    }

    @Override
    public void run() {
        while (true) {
            try {
                int selectKey = selector.select();
                if (selectKey > 0) {
                    Set<SelectionKey> keySet = selector.selectedKeys();
                    Iterator<SelectionKey> iter = keySet.iterator();
                    while (iter.hasNext()) {
                        SelectionKey selectionKey = iter.next();
                        iter.remove();
                        if (selectionKey.isAcceptable()) {
                            accept(selectionKey);
                        }
                        if (selectionKey.isReadable()) {
                            read(selectionKey);
                        }
                        if (selectionKey.isWritable()) {
                            // write(selectionKey);
                            System.out.println();
                        }
                    }
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                try {
                    serverSocketChannel.close();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }

        }
    }

    public void accept(SelectionKey key) {
        try {
            ServerSocketChannel serverSocketChannel = (ServerSocketChannel) key.channel();
            SocketChannel socketChannel = serverSocketChannel.accept();
            System.out.println("is acceptable");
            socketChannel.configureBlocking(false);
            socketChannel.register(selector, SelectionKey.OP_READ);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // 一个client的write事件不一定唯一对应server的read事件，所以需要缓存不完整的包，以便拼接成完整的包
    //包协议：包=包头(4byte)+包体，包头内容为包体的数据长度
    public void read(SelectionKey selectionKey) {
        System.out.println("read事件");
        int head_length = 4;//数据包长度
        byte[] headByte = new byte[4];

        try {
            SocketChannel channel = (SocketChannel) selectionKey.channel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(100);
            int bodyLen = -1;
            if (cache) {
                cacheBuffer.flip();
                byteBuffer.put(cacheBuffer);
            }
            channel.read(byteBuffer);// 当前read事件
            byteBuffer.flip();// write mode to read mode
            while (byteBuffer.remaining() > 0) {
                if (bodyLen == -1) {// 还没有读出包头，先读出包头
                    if (byteBuffer.remaining() >= head_length) {// 可以读出包头，否则缓存
                        byteBuffer.mark();
                        byteBuffer.get(headByte);
                        bodyLen = byteArrayToInt(headByte);
                    } else {
                        byteBuffer.reset();
                        cache = true;
                        cacheBuffer.clear();
                        cacheBuffer.put(byteBuffer);
                        break;
                    }
                } else {// 已经读出包头
                    if (byteBuffer.remaining() >= bodyLen) {// 大于等于一个包，否则缓存
                        byte[] bodyByte = new byte[bodyLen];
                        byteBuffer.get(bodyByte, 0, bodyLen);
                        bodyLen = -1;

                        System.out.println("receive from clien content is:" + new String(bodyByte));
                    } else {
                        byteBuffer.reset();
                        cacheBuffer.clear();
                        cacheBuffer.put(byteBuffer);
                        cache = true;
                        break;
                    }
                }
            }

            selectionKey.interestOps(SelectionKey.OP_READ);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            try {
                serverSocketChannel.close();
                selectionKey.cancel();
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            e.printStackTrace();
        }

    }

    public void write(SelectionKey selectionKey) {
        SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
        String httpResponse = "HTTP/1.1 200 OK\r\n" + "Content-Length: 38\r\n" + "Content-Type: text/html\r\n" + "\r\n"
                + "<html><body>Hello World!</body></html>";
        System.out.println("response from server to client");
        try {
            ByteBuffer byteBuffer = ByteBuffer.wrap(httpResponse.getBytes());
            while (byteBuffer.hasRemaining()) {
                socketChannel.write(byteBuffer);
            }
            selectionKey.cancel();
        } catch (IOException e) {
            try {
                selectionKey.cancel();
                serverSocketChannel.close();
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * byte[]转int
     *
     * @param bytes
     * @return
     */
    public static int byteArrayToInt(byte[] bytes) {
        int value = 0;
        // 由高位到低位
        for (int i = 0; i < 4; i++) {
            int shift = (4 - 1 - i) * 8;
            value += (bytes[i] & 0x000000FF) << shift;// 往高位游
        }
        return value;
    }

    public static void main(String[] args) throws IOException {
        NioSocketServer server = new NioSocketServer();
        server.initServer();
        server.start();

    }
}
