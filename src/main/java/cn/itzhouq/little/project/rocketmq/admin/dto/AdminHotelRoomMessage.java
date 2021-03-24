package cn.itzhouq.little.project.rocketmq.admin.dto;

/**
 * 酒店房间更新信息
 *
 * @author zhouquan
 * @date 2021/3/24 10:53
 */
public class AdminHotelRoomMessage {
    /**
     * 房间id
     */
    private Long roomId;

    /**
     * 手机号
     */
    private String phoneNumber;

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
