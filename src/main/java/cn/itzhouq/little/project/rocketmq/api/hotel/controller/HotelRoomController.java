package cn.itzhouq.little.project.rocketmq.api.hotel.controller;

import cn.itzhouq.little.project.rocketmq.api.hotel.service.HotelRoomService;
import com.ruyuan.little.project.common.dto.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 提供给小程序房间查询api接口
 *
 * @author zhouquan
 * @date 2021/3/22 14:20
 */
@RestController
@RequestMapping(value = "/api/hotel")
public class HotelRoomController {

    @Autowired
    private HotelRoomService hotelRoomService;

    /**
     * 根据酒店房间id查询房间详情
     *
     * @return 结果
     */
    @GetMapping(value = "getRoomById")
    public CommonResponse getRoomById(@RequestParam(value = "id") Long id,
                                      @RequestParam(value = "phoneNumber") String phoneNumber) {
        return hotelRoomService.getRoomById(id, phoneNumber);
    }
}