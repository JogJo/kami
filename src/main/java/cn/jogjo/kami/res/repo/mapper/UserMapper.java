package cn.jogjo.kami.repo.mapper;

import cn.jogjo.kami.repo.po.UserPO;
import com.mybatisflex.core.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户-持久化映射
 *
 * @author JogJo
 * @since 2025-03-08 09:02:28
 */
@Mapper
public interface UserMapper extends BaseMapper<UserPO> {

}
