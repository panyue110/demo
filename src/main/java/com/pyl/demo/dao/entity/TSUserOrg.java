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
public class TSUserOrg implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * id
     */
    @TableId("ID")
    private String id;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 部门id
     */
    private String orgId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @Override
    public String toString() {
        return "TSUserOrg{" +
        "id=" + id +
        ", userId=" + userId +
        ", orgId=" + orgId +
        "}";
    }
}
