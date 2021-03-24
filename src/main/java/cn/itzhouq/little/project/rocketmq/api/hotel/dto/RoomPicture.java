package cn.itzhouq.little.project.rocketmq.api.hotel.dto;

/**
 * 房间图片信息
 *
 * @author zhouquan
 * @date 2021/3/22 14:15
 */
public class RoomPicture {
    /**
     * 图片id
     */
    private Integer id;

    /**
     * 图片地址
     */
    private String url;

    private String src;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }
}
