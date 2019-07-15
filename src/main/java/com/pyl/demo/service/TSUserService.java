package com.pyl.demo.service;

import com.pyl.demo.dao.entity.TSUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pyl.demo.utils.Page;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author panyue
 * @since 2019-06-17
 */
public interface TSUserService extends IService<TSUser> {

    List<TSUser> queryList(Page page);
}
