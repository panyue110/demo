package com.pyl.demo.utils;

import com.pyl.demo.enums.ResponseEnum;

import java.util.ArrayList;
import java.util.List;

public class Response {

    public static <T> Result<T> Success() {
        Result<T> result = new Result<T>();
        result.setCode(ResponseEnum.SUCCESS.getCode());
        result.setMsg(ResponseEnum.SUCCESS.getMsg());
        result.setSuccess(ResponseEnum.SUCCESS.isSuccess());
        return result;
    }
    public static <T> Result<T> Success(String msgStr) {
        Result<T> result = new Result<T>();
        result.setCode(ResponseEnum.SUCCESS.getCode());
        result.setMsg(msgStr);
        result.setSuccess(ResponseEnum.SUCCESS.isSuccess());
        return result;
    }

    public static <T> Result<T> Success(String msgStr,T data) {
        Result<T> result = new Result<T>();
        result.setCode(ResponseEnum.SUCCESS.getCode());
        result.setMsg(msgStr);
        result.setSuccess(ResponseEnum.SUCCESS.isSuccess());
        result.setData(data);
        return result;
    }


    public static <T> Result<T> Fail() {
        Result<T> result = new Result<T>();
        result.setCode(ResponseEnum.FAIL.getCode());
        result.setMsg(ResponseEnum.FAIL.getMsg());
        result.setSuccess(ResponseEnum.FAIL.isSuccess());
        return result;
    }

    public static <T> Result<T> Fail(String msgStr) {
        Result<T> result = new Result<T>();
        result.setCode(ResponseEnum.FAIL.getCode());
        result.setMsg(msgStr);
        result.setSuccess(ResponseEnum.FAIL.isSuccess());
        return result;
    }

    public static <T> Result<T> Fail(String msgStr,T data) {
        Result<T> result = new Result<T>();
        result.setCode(ResponseEnum.FAIL.getCode());
        result.setMsg(msgStr);
        result.setSuccess(ResponseEnum.FAIL.isSuccess());
        result.setData(data);
        return result;
    }



    public static <T> Result<T> Error() {
        Result<T> result = new Result<T>();
        result.setCode(ResponseEnum.ERROR.getCode());
        result.setMsg(ResponseEnum.ERROR.getMsg());
        result.setSuccess(ResponseEnum.ERROR.isSuccess());
        return result;
    }

    public static <T> Result<T> Error(String msgStr) {
        Result<T> result = new Result<T>();
        result.setCode(ResponseEnum.ERROR.getCode());
        result.setMsg(msgStr);
        result.setSuccess(ResponseEnum.ERROR.isSuccess());
        return result;
    }

    public static <T> Result<T> Error(String msgStr,T data) {
        Result<T> result = new Result<T>();
        result.setCode(ResponseEnum.ERROR.getCode());
        result.setMsg(msgStr);
        result.setSuccess(ResponseEnum.ERROR.isSuccess());
        result.setData(data);
        return result;
    }


    public static <T> Result<List> Page(List<T> list,Page page) {
        Result<List> result = new Result<List>();
        result.setCode(0);
        result.setCount(list.size());
        int firstIndex = (page.getPage() - 1) * page.getLimit();
        //到第几条数据结束
        int lastIndex = page.getPage() + page.getLimit();
        //直接在list中截取
        list = list.subList(firstIndex, lastIndex);
        result.setData(list);
        return result;
    }

}
