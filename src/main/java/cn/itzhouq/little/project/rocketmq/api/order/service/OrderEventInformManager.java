package cn.itzhouq.little.project.rocketmq.api.order.service;

import cn.itzhouq.little.project.rocketmq.api.order.dto.OrderInfoDTO;

/**
 * 订单事件通知组件
 *
 * @author zhouquan
 * @date 2021/3/27 13:42
 */
public interface OrderEventInformManager {
    /**
     * 通知创建订单事件
     *
     * @param orderInfoDTO 订单信息
     */
    void informCreateOrderEvent(OrderInfoDTO orderInfoDTO);
}
