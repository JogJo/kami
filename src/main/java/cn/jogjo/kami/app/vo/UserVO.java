package cn.jogjo.kami.app.vo;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户-持久化对象
 *
 * @author Jogjo
 * @since 2025-03-08 08:52:43
 */
@Data
public class UserVO implements Serializable {
    @Serial
    private static final long serialVersionUID = -4602558667387255107L;

    private Long id;
    private Date createTime;
    private Date updateTime;

    private String name;

    private String pwd;
}
