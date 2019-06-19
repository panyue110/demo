package com.pyl.demo.dao.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;

@Data
public class MyUserDetails implements Serializable, UserDetails {

    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
    private String role;
    private String realname;
    private String departid;
    private boolean accountNonExpired;
    private boolean accountNonLocked;
    private boolean credentialsNonExpired;
    private boolean enabled;

    public MyUserDetails(String username,String realname, String password, String departid, String role, boolean accountNonExpired, boolean accountNonLocked,
                         boolean credentialsNonExpired, boolean enabled) {

        this.username = username;
        this.realname = realname;
        this.password = password;
        this.departid = departid;
        this.role = role;
        this.accountNonExpired = accountNonExpired;
        this.accountNonLocked = accountNonLocked;
        this.credentialsNonExpired = credentialsNonExpired;
        this.enabled = enabled;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return AuthorityUtils.commaSeparatedStringToAuthorityList(role);
    }
}
