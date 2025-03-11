package cn.jogjo.kami.repo.po;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
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
@Table("org_user")
public class UserPO implements Serializable {

    @Serial
    private static final long serialVersionUID = 9096389963398825579L;

    @Id(keyType = KeyType.Auto)
    private Long id;
    private Date createTime;
    private Date updateTime;

    private String name;

    private String pwd;
}
