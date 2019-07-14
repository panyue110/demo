package com.pyl.demo.utils;

import lombok.Data;

@Data
public class RequestPage {

    //当前页
    Integer page = 1;
    //每页显示数量
    Integer limit;


}
