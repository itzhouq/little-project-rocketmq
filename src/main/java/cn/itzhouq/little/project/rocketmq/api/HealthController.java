package cn.itzhouq.little.project.rocketmq.api;

//import com.ruyuan.little.project.common.dto.CommonResponse;
import com.ruyuan.little.project.common.dto.CommonResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 健康检查的controller
 * @author zhouquan
 * @date 2021/3/17 10:05
 */
@RestController
public class HealthController {

    @RequestMapping(value = "/")
    public CommonResponse health() {
        return CommonResponse.success();
    }
}
