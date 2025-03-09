package cn.jogjo.kami.pow;

import cn.jogjo.kami.res.base.ActResult;

/**
 * 系统-能力
 *
 * @author JogJo
 * @since 2025-03-08 11:24:22
 */
public interface SysPow {

    /**
     * 关闭应用
     */
    ActResult<String> exit();

    /**
     * 重启应用
     */
    ActResult<String> restart();

}
