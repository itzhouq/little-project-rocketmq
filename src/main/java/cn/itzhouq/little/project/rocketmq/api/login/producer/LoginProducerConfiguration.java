package cn.itzhouq.little.project.rocketmq.api.login.producer;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 登录的rocketmq生产者配置类
 *
 * @author zhouquan
 * @date 2021/3/17 14:55
 */
@Configuration
public class LoginProducerConfiguration {
    @Value("${rocketmq.namesrv.address}")
    private String namesrvAddress;

    @Value("${rocketmq.login.producer.group}")
    private String loginProducerGroup;

    /**
     * 登录生产者
     *
     * @return 登录消息rocketmq的生产者对象
     */
    @Bean(value = "loginMqProducer")
    public DefaultMQProducer loginMqProducer() throws MQClientException {
        DefaultMQProducer producer = new DefaultMQProducer(loginProducerGroup);
        producer.setNamesrvAddr(namesrvAddress);
        producer.start();
        return producer;
    }
}
