package cn.jogjo.kami.app.api;

import cn.jogjo.kami.pow.UserPow;
import cn.jogjo.kami.repo.po.UserPO;
import cn.jogjo.kami.res.base.ActResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户-应用接口
 *
 * @author JogJo
 * @since 2025-03-08 09:15:00
 */
@RequestMapping("/api/user/")
@RestController
public class UserApi {

    @Autowired
    private UserPow userPow;

    @GetMapping("list")
    public ActResult<List<UserPO>> list() {
        return ActResult.success(userPow.list());
    }
}
