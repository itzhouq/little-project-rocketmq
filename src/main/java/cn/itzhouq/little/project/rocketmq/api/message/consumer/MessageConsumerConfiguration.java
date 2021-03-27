package cn.itzhouq.little.project.rocketmq.api.message.consumer;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.MessageListenerOrderly;
import org.apache.rocketmq.client.exception.MQClientException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 消费者消息
 *
 * @author zhouquan
 * @date 2021/3/27 14:51
 */
@Configuration
public class MessageConsumerConfiguration {
    /**
     * namesrv address
     */
    @Value("${rocketmq.namesrv.address}")
    private String namesrvAddress;

    /**
     * 订单topic
     */
    @Value("${rocketmq.order.topic}")
    private String orderTopic;

    /**
     * 订单topic消费者组
     */
    @Value("${rocketmq.order.consumer.group}")
    private String orderConsumerGroup;

    /**
     * 订单消息的consumer bean
     *
     * @return 订单消息的consumer bean
     */
    @Bean(value = "orderConsumer")
    public DefaultMQPushConsumer orderConsumer(@Qualifier(value = "orderMessageListener") MessageListenerOrderly orderMessageListener) throws MQClientException {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer(orderConsumerGroup);
        consumer.setNamesrvAddr(namesrvAddress);
        consumer.subscribe(orderTopic, "*");
        consumer.setMessageListener(orderMessageListener);
        consumer.start();
        return consumer;
    }
}
