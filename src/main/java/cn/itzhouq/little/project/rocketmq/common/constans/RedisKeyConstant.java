package cn.itzhouq.little.project.rocketmq.common.constans;

/**
 * redis操作key
 *
 * @author zhouquan
 * @date 2021/3/22 10:56
 */
public class RedisKeyConstant {
    /**
     * 第一次登陆重复消费 保证幂等的key前缀
     */
    public static final String FIRST_LOGIN_DUPLICATION_KEY_PREFIX = "little:project:firstLoginDuplication:";
}
