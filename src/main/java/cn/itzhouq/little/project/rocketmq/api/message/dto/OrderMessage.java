package cn.itzhouq.little.project.rocketmq.api.message.dto;

import com.ruyuan.little.project.common.enums.MessageTypeEnum;

/**订单消息
 * @author zhouquan
 * @date 2021/3/27 14:54
 */
public class OrderMessage {
    /**
     * 消息内容
     */
    private String content;

    /**
     * 订单消息推送类型 {@link MessageTypeEnum}
     */
    private MessageTypeEnum messageType;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MessageTypeEnum getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageTypeEnum messageType) {
        this.messageType = messageType;
    }
}
