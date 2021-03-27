package cn.itzhouq.little.project.rocketmq.api.order.service.impl;

import cn.itzhouq.little.project.rocketmq.api.order.dto.OrderInfoDTO;
import cn.itzhouq.little.project.rocketmq.api.order.dto.OrderMessageDTO;
import cn.itzhouq.little.project.rocketmq.api.order.service.OrderEventInformManager;
import com.alibaba.fastjson.JSON;
import com.ruyuan.little.project.common.enums.MessageTypeEnum;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.MessageQueueSelector;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageQueue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * 订单事件通知组件实现类
 *
 * @author zhouquan
 * @date 2021/3/27 13:46
 */
@Service
public class OrderEventInformManagerImpl implements OrderEventInformManager {
    /**
     * 日志
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderEventInformManagerImpl.class);

    @Autowired
    @Qualifier(value = "orderMqProducer")
    private DefaultMQProducer orderMqProducer;

    /**
     * 订单消息topic
     */
    @Value("${rocketmq.order.topic}")
    private String orderTopic;

    @Override
    public void informCreateOrderEvent(OrderInfoDTO orderInfoDTO) {
        // 订单状态顺序消息
        this.sendOrderMessage(MessageTypeEnum.WX_CREATE_ORDER, orderInfoDTO);
    }

    /**
     * 发送订单消息
     *
     * @param messageTypeEnum 订单消息类型
     */
    private void sendOrderMessage(MessageTypeEnum messageTypeEnum, OrderInfoDTO orderInfoDTO) {
        OrderMessageDTO orderMessageDTO = new OrderMessageDTO();
        orderMessageDTO.setMessageType(messageTypeEnum);
        orderMessageDTO.setContent(JSON.toJSONString(orderInfoDTO));
        Message message = new Message();
        message.setTopic(orderTopic);
        message.setBody(JSON.toJSONString(orderMessageDTO).getBytes(StandardCharsets.UTF_8));
        try {
            orderMqProducer.send(message, new MessageQueueSelector() {
                @Override
                public MessageQueue select(List<MessageQueue> mqs, Message msg, Object orderId) {
                    // 订单id
                    Integer id = (Integer) orderId;
                    int index = id % mqs.size();
                    return mqs.get(index);
                }
            }, orderInfoDTO.getId());
            LOGGER.info("send order message finished messageTypeEnum:{}, orderNo:{}", messageTypeEnum, orderInfoDTO.getOrderNo());
        } catch (Exception e) {
            // 发送订单消息失败
            LOGGER.error("send order message fail,error message:{}", e.getMessage());
        }
    }

}
