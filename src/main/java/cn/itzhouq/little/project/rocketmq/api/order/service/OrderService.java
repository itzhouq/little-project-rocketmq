package cn.itzhouq.little.project.rocketmq.api.order.service;

import cn.itzhouq.little.project.rocketmq.api.order.dto.CreateOrderResponseDTO;
import cn.itzhouq.little.project.rocketmq.api.order.dto.OrderInfoDTO;
import com.ruyuan.little.project.common.dto.CommonResponse;

/**
 * 订单service组件
 *
 * @author zhouquan
 * @date 2021/3/27 13:44
 */
public interface OrderService {
    /**
     * 创建订单
     *
     * @param orderInfoDTO 订单信息
     * @return 结果
     */
    CommonResponse<CreateOrderResponseDTO> createOrder(OrderInfoDTO orderInfoDTO);
}
