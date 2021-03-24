package cn.itzhouq.little.project.rocketmq.api.hotel.service;

import cn.itzhouq.little.project.rocketmq.api.hotel.dto.HotelRoom;
import com.ruyuan.little.project.common.dto.CommonResponse;

/**
 *酒店房间管理service组件
 * @author zhouquan
 * @date 2021/3/22 14:18
 */
public interface HotelRoomService {
    /**
     * 根据小程序房间id查询房间详情
     *
     * @param id          房间id
     * @param phoneNumber 手机号
     * @return 结果
     */
    CommonResponse<HotelRoom> getRoomById(Long id, String phoneNumber);
}
