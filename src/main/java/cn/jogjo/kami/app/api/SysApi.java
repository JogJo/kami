package cn.jogjo.kami.app.api;

import cn.jogjo.kami.pow.SysPow;
import cn.jogjo.kami.res.norm.ActResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 系统-应用接口
 *
 * @author JogJo
 * @since 2025-03-09 04:08:07
 */
@RequestMapping("/api/sys/")
@RestController
public class SysApi {

    @Autowired
    private SysPow sysPow;

    @GetMapping("restart")
    public ActResult<String> restart() {
        return sysPow.restart();
    }
}
