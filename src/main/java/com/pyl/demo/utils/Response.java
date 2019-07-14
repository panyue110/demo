package com.pyl.demo.utils;

import com.pyl.demo.enums.ResponseEnum;

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


    public static <T> Result<T> Page(T data,Integer count) {
        Result<T> result = new Result<T>();
        result.setCode(0);
        result.setData(data);
        result.setCount(count);
        return result;
    }

}
