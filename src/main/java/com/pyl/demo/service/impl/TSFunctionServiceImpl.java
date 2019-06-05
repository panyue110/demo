package com.pyl.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pyl.demo.dao.entity.TSFunction;
import com.pyl.demo.dao.mapper.TSFunctionMapper;
import com.pyl.demo.dao.vo.TSFunctionVo;
import com.pyl.demo.service.TSFunctionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yux
 * @since 2019-05-24
 */
@Service
public class TSFunctionServiceImpl extends ServiceImpl<TSFunctionMapper, TSFunction> implements TSFunctionService {

    @Autowired
    private TSFunctionMapper tsFunctionMapper;
    @Override
    public List<TSFunctionVo> selectMenus(String functionlevel, String parentfunctionid) {

        QueryWrapper<TSFunction> wrapper = new QueryWrapper<TSFunction>();
        if (StringUtils.isNotEmpty(parentfunctionid)) {
           wrapper.eq("parentfunctionid", parentfunctionid);
        }
        if (StringUtils.isNotEmpty(parentfunctionid)) {
            wrapper.eq("functionlevel", functionlevel);
        }
        wrapper.orderByAsc("functionorder");
        List<TSFunction> list = tsFunctionMapper.selectList(wrapper);
        List<TSFunctionVo> voList= new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            TSFunctionVo vo = new TSFunctionVo();
            BeanUtils.copyProperties(list.get(i), vo);
            voList.add(vo);

        }
        return getTreeList("0",voList);
    }

    /**
     * 解析树形数据
     * @param parentfunctionid
     * @param entityList
     * @return
     */
    public  List<TSFunctionVo> getTreeList(String parentfunctionid, List<TSFunctionVo> entityList) {
        List<TSFunctionVo> resultList = new ArrayList<>();

        //获取顶层元素集合
        String parentId;
        for (TSFunctionVo entity : entityList) {
            parentId = entity.getParentfunctionid();
            if(parentId==null || parentfunctionid.equals(parentId)){
                resultList.add(entity);
            }
        }
        //获取每个顶层元素的子数据集合
        for (TSFunctionVo entity : resultList) {
            entity.setChildList(getSubList(entity.getId(),entityList));
        }
        return resultList;
    }

    /**
     * 获取子数据集合
     * @param id
     * @param entityList
     * @return
     */
    private  List<TSFunctionVo> getSubList(String id, List<TSFunctionVo> entityList) {
        List<TSFunctionVo> childList=new ArrayList<>();
        String parentId;

        //子集的直接子对象
        for (TSFunctionVo entity : entityList) {
            parentId = entity.getParentfunctionid();
            if(id.equals(parentId)){
                childList.add(entity);
            }
        }

        //子集的间接子对象
        for (TSFunctionVo entity : childList) {
            entity.setChildList(getSubList(entity.getId(), entityList));
        }

        //递归退出条件
        if(childList.size()==0){
            return null;
        }

        return childList;
    }

}
