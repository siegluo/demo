package com.example.demo.mq.rabbitmq.confirm;

import java.io.IOException;
import java.io.Serializable;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.ReturnListener;
import org.apache.commons.lang3.SerializationUtils;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.ConfirmListener;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;

/**
 * 应答模式之confirm机制：消息发送
 *
 */
public class ConfirmSend {
    private static String exchange_name = "";
    private static String queue_name = "tx_queue";

    /**
     * confirm机制：确认publisher发送消息到broker，由broker进行应答(不能确认是否被有效消费)
     * confirmSelect，进入confirm消息确认模式，确认方式：1、异步ConfirmListener；2、同步waitForConfirms
     * ConfirmListener、waitForConfirms均需要配合confirm机制使用
     *
     * @param mes
     * @throws Exception
     */
    public static void txSend(Serializable mes) throws Exception {
        CachingConnectionFactory cf = new CachingConnectionFactory();
        cf.setAddresses("192.168.1.13");
        cf.setUsername("guest");
        cf.setPort(5672);
        cf.setPassword("guest");
        cf.setVirtualHost("/");
        cf.setPublisherConfirms(true);
        cf.setPublisherReturns(true);
        org.springframework.amqp.rabbit.connection.Connection conn = cf.createConnection();
        Channel channel = conn.createChannel(false);
        //开启transaction机制
        channel.confirmSelect();
        channel.queueDeclare(queue_name, false, false, true, null);
        //异步实现发送消息的确认(此部分的消息确认是指发送消息到队列，并非确认消息的有效消费)
        channel.addConfirmListener(new ConfirmListener() {

            @Override
            public void handleNack(long deliveryTag, boolean multiple)
                    throws IOException {
                //multiple：测试发现multiple随机true或false，原因未知
                System.out.println("Nack deliveryTag:" + deliveryTag + ",multiple:" + multiple);
            }

            @Override
            public void handleAck(long deliveryTag, boolean multiple)
                    throws IOException {
                System.out.println("Ack deliveryTag:" + deliveryTag + ",multiple:" + multiple);
            }
        });
        channel.addReturnListener(new ReturnListener() {
            @Override
            public void handleReturn(int replyCode, String replyText, String exchange, String routingKey, AMQP.BasicProperties properties, byte[] body) throws IOException {
                System.out.println("111");
            }
        });
        for (int i = 0; i < 10; i++) {
            channel.basicPublish(exchange_name, queue_name, null, SerializationUtils.serialize(mes.toString() + i));
        }
        boolean confirms = channel.waitForConfirms();//同步实现发送消息的确认
        System.out.println("-----------"+confirms);
        channel.close();
        conn.close();
    }

    public static void main(String[] args) throws Exception {
        txSend("hello world!");
    }
}
