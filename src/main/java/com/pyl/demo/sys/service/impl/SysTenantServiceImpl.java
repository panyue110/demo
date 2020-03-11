package com.pyl.demo.sys.service.impl;

import com.pyl.demo.sys.dao.entity.SysTenant;
import com.pyl.demo.sys.dao.mapper.SysTenantMapper;
import com.pyl.demo.sys.service.SysTenantService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 租户表 服务实现类
 * </p>
 *
 * @author panyue
 * @since 2020-03-11
 */
@Service
public class SysTenantServiceImpl extends ServiceImpl<SysTenantMapper, SysTenant> implements SysTenantService {

}
