package cn.itzhouq.little.project.rocketmq.admin.service;

import cn.itzhouq.little.project.rocketmq.admin.dto.AdminHotelRoom;
import com.ruyuan.little.project.common.dto.CommonResponse;

/**
 * 商品更新service组件
 *
 * @author zhouquan
 * @date 2021/3/24 10:52
 */
public interface AdminRoomService {
    /**
     * 添加房间
     *
     * @param adminHotelRoom 房间内容
     * @return 结果
     */
    CommonResponse add(AdminHotelRoom adminHotelRoom);

    /**
     * 更新商品信息
     *
     * @param adminHotelRoom 请求体内容
     * @return
     */
    CommonResponse update(AdminHotelRoom adminHotelRoom);
}
