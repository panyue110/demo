package com.pyl.demo.utils;

import lombok.Data;

import java.util.List;

@Data
public class Page {

    //当前页
    Integer page = 1;
    //每页显示数量
    Integer limit;
    //数据中条数
    Integer count;

    public List getPage(List list){
        count = list.size();

       int firstIndex = (page - 1) * limit;
       //到第几条数据结束
       int lastIndex = page + limit;
       return list.subList(firstIndex, lastIndex); //直接在list中截取
   }
}
