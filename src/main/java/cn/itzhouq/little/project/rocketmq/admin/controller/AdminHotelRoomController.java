package cn.itzhouq.little.project.rocketmq.admin.controller;

import cn.itzhouq.little.project.rocketmq.admin.dto.AdminHotelRoom;
import cn.itzhouq.little.project.rocketmq.admin.service.AdminRoomService;
import com.ruyuan.little.project.common.dto.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 后台管理系统-->房间管理组件
 *
 * @author zhouquan
 * @date 2021/3/24 10:51
 */
@RestController
@RequestMapping(value = "/admin/hotel/room")
public class AdminHotelRoomController {
    @Autowired
    private AdminRoomService roomAdminService;

    @PostMapping(value = "/add")
    public CommonResponse add(@RequestBody AdminHotelRoom adminHotelRoom) {
        return roomAdminService.add(adminHotelRoom);
    }

    @PostMapping(value = "/update")
    public CommonResponse update(@RequestBody AdminHotelRoom adminHotelRoom) {
        return roomAdminService.update(adminHotelRoom);
    }
}
