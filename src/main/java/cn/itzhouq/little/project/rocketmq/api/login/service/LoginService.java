package cn.itzhouq.little.project.rocketmq.api.login.service;

import cn.itzhouq.little.project.rocketmq.api.login.dto.LoginRequestDTO;

/**
 * 登陆接口service组件
 *
 * @author zhouquan
 * @date 2021/3/17 14:56
 */
public interface LoginService {
    /**
     * 第一次登陆分发优惠券
     *
     * @param loginRequestDTO 登陆信息
     */
    void firstLoginDistributeCoupon(LoginRequestDTO loginRequestDTO);

    /**
     * 重置用户的登录状态
     *
     * @param phoneNumber 手机号
     */
    void resetFirstLoginStatus(String phoneNumber);
}
