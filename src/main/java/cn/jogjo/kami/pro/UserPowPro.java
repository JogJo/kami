package cn.jogjo.kami.pro;

import cn.jogjo.kami.pow.UserPow;
import cn.jogjo.kami.repo.mapper.UserMapper;
import cn.jogjo.kami.repo.po.UserPO;
import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 用户-能力创造
 *
 * @author JogJo
 * @since 2025-03-08 09:12:22
 */
@Service
public class UserPowPro extends ServiceImpl<UserMapper,UserPO> implements UserPow {

}
