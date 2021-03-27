package cn.itzhouq.little.project.rocketmq.api.order.producer;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 订单rocketMQ生产者配置类
 *
 * @author zhouquan
 * @date 2021/3/27 13:38
 */
@Configuration
public class OrderProducerConfiguration {
    @Value("${rocketmq.namesrv.address}")
    private String namesrvAddress;

    @Value("${rocketmq.order.producer.group}")
    private String orderProducerGroup;

    /**
     * 订单消息生产者
     *
     * @return 订单消息rocketmq的生产者对象
     */
    @Bean(value = "orderMqProducer")
    public DefaultMQProducer orderMqProducer() throws MQClientException {
        DefaultMQProducer producer = new DefaultMQProducer(orderProducerGroup);
        producer.setNamesrvAddr(namesrvAddress);
        producer.start();
        return producer;
    }
}
