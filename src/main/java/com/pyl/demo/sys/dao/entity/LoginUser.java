package com.pyl.demo.sys.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.springblade.core.tool.utils.Func;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author panyue
 * @since 2020-03-11
 */
@Data
public class LoginUser implements UserDetails {

private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;


    /**
     * 部门列表
     */
    private List<Integer> deptIds;

    /**
     * 角色列表
     */
    private List<Integer> roleIds;

    private Collection<? extends GrantedAuthority> authorities;


    /**
     * 账户是否过期
     * @return
     */
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    /**
     * 用户账号是否被锁定
     * @return
     */
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    /**
     * 用户账号凭证(密码)是否过期
     * @return
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    /**
     * 用户账号是否被启用
     * @return
     */
    @Override
    public boolean isEnabled() {
        return true;
    }

    public LoginUser(Integer id,
                     String username,
                     String password,
                     String deptIds,
                     String roleIds) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.deptIds = Func.toIntList(deptIds);
        this.roleIds = Func.toIntList(roleIds);
    }
}
