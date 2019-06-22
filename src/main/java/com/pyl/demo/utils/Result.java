package com.pyl.demo.utils;

import lombok.Data;

@Data
public class Result<T> {


    private boolean success;

    private Integer code;

    private String msg;

    private T data;
}
