package cn.itzhouq.little.project.rocketmq.api.message.dto;

/**订单商品条目
 * @author zhouquan
 * @date 2021/3/27 14:53
 */
public class OrderItem {
    /**
     * 房间名称
     */
    private String title;

    /**
     * 订购数量
     */
    private Integer total;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
