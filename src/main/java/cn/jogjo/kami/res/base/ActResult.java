package cn.jogjo.kami.res.base;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 行为响应结果
 *
 * @author JogJo
 * @since 2025-03-08 09:07:53
 */
@Data
public class ActResult<T> implements Serializable {
    @Serial
    private static final long serialVersionUID = -2040234781909352503L;

    /**
     * 错误码：对应 ActCodeBase
     */
    private Integer code;

    /**
     * 返回数据
     */
    private T data;

    /**
     * 错误信息
     */
    private String msg;

    /**
     * 操作是否成功：true成功，false失败
     */
    private boolean success;

    private ActResult(Integer code, T data, String msg, boolean success) {
        this.code = code;
        this.data = data;
        this.msg = msg;
        this.success = success;
    }

    public static <T> ActResult<T> success() {
        return new ActResult<T>(ActCode.SUCCESS, null, null, true);
    }

    public static <T> ActResult<T> success(T data) {
        return new ActResult<T>(ActCode.SUCCESS, data, null, true);
    }

    public static <T> ActResult<T> failure() {
        return new ActResult<T>(ActCode.FAILURE, null, null, false);
    }

    public static <T> ActResult<T> failure(Integer code) {
        return new ActResult<T>(code, null, null, false);
    }

    public static <T> ActResult<T> failure(String msg) {
        return new ActResult<T>(ActCode.FAILURE, null, msg, false);
    }

    public static <T> ActResult<T> failure(Integer code, String msg) {
        return new ActResult<T>(code, null, msg, false);
    }
}
