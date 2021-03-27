package cn.itzhouq.little.project.rocketmq.api.coupon.service;

import org.springframework.stereotype.Service;

/**
 * 优惠券服务service组件
 *
 * @author zhouquan
 * @date 2021/3/22 10:45
 */
@Service
public interface CouponService {
    /**
     * 分发第一次登陆的优惠券
     *
     * @param beid           业务id
     * @param userId         用户id
     * @param couponConfigId 下发优惠券配置表id
     * @param validDay       有效天数
     * @param sourceOrderId  优惠券来源订单id
     * @param phoneNumber    手机号
     */
    void distributeCoupon(Integer beid,
                          Integer userId,
                          Integer couponConfigId,
                          Integer validDay,
                          Integer sourceOrderId, String phoneNumber);

    /**
     * 使用优惠券
     *
     * @param orderId     订单id
     * @param couponId    优惠券id
     * @param phoneNumber 用户手机号
     */
    void usedCoupon(Integer orderId, Integer couponId, String phoneNumber);
}
