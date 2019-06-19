package com.pyl.demo.dao.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import java.sql.Blob;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author panyue
 * @since 2019-06-17
 */
@Data
public class TSBaseUser implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId("ID")
    private String id;

    /**
     * 同步流程
     */
    @TableField("activitiSync")
    private Integer activitiSync;

    /**
     * 浏览器
     */
    private String browser;

    /**
     * 密码
     */
    private String password;

    /**
     * 真实名字
     */
    private String realname;


    /**
     * 有效状态
     */
    private Integer status;

    /**
     * 用户KEY
     */
    private String userkey;

    /**
     * 用户账号
     */
    private String username;

    /**
     * 部门ID
     */
    private String departid;

    /**
     * 英文名
     */
    private String userNameEn;

    /**
     * 删除状态
     */
    private Integer deleteFlag;




    @Override
    public String toString() {
        return "TSBaseUser{" +
        "id=" + id +
        ", activitiSync=" + activitiSync +
        ", browser=" + browser +
        ", password=" + password +
        ", realname=" + realname +
        ", status=" + status +
        ", userkey=" + userkey +
        ", username=" + username +
        ", departid=" + departid +
        ", userNameEn=" + userNameEn +
        ", deleteFlag=" + deleteFlag +
        "}";
    }
}
