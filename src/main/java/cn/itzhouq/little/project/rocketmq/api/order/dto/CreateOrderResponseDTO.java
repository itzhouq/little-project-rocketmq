package cn.itzhouq.little.project.rocketmq.api.order.dto;

/**
 * 创建订单详情体内容
 *
 * @author zhouquan
 * @date 2021/3/27 12:03
 */
public class CreateOrderResponseDTO {
    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 订单id
     */
    private Integer orderId;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}
