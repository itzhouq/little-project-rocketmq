package cn.itzhouq.little.project.rocketmq.common.exception;

/**
 * 系统业务异常
 *
 * @author zhouquan
 * @date 2021/3/22 10:55
 */
public class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super(message);
    }
}
