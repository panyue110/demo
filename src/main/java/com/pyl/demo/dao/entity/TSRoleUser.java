package com.pyl.demo.dao.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yux
 * @since 2019-06-17
 */
public class TSRoleUser implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId("ID")
    private String id;

    /**
     * 角色ID
     */
    private String roleid;

    /**
     * 用户ID
     */
    private String userid;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "TSRoleUser{" +
        "id=" + id +
        ", roleid=" + roleid +
        ", userid=" + userid +
        "}";
    }
}
