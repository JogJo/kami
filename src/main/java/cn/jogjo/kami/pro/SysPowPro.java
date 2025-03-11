package cn.jogjo.kami.pro;

import cn.jogjo.kami.KamiApplication;
import cn.jogjo.kami.pow.SysPow;
import cn.jogjo.kami.res.norm.ActResult;
import cn.jogjo.kami.res.config.SysExitCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * 系统-能力创造
 *
 * @author JogJo
 * @since 2025-03-08 11:28:28
 */
@Service
public class SysPowPro implements SysPow {

    @Autowired
    private ApplicationContext context;

    @Override
    public ActResult<String> exit() {
        SpringApplication.exit(context, new SysExitCode());
        return ActResult.success();
    }

    @Override
    public ActResult<String> restart() {
        ApplicationArguments args = context.getBean(ApplicationArguments.class);
        Thread thread = new Thread(() -> {
            SpringApplication.exit(context, new SysExitCode());
            context = SpringApplication.run(KamiApplication.class, args.getSourceArgs());
        });
        // 必须将重启线程设置为user线程，防止close方法触发jvm关闭所有线程，导致重启失败（当唯一运行的线程都是守护进程线程时，Java虚拟机将退出）
        thread.setDaemon(false);
        thread.start();
        return ActResult.success();
    }
}
