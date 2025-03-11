package cn.jogjo.kami.res.config;

import cn.jogjo.kami.res.norm.ActCode;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;

/**
 * 系统配置-停止代码
 *
 * @author JogJo
 * @since 2025-03-08 11:16:28
 */
@Component
public class SysExitCode implements ExitCodeGenerator {
    @Override
    public int getExitCode() {
        return ActCode.SUCCESS;
    }
}
