package com.pyl.demo.utils;

import com.pyl.demo.enums.ResponseEnum;
import lombok.Data;

@Data
public  class ResponseUtils {

    private static boolean success;
    private static Integer code;
    private static String msg;

    public ResponseUtils(boolean success,Integer code , String msg) {

        this.success = success;
        this.code = code;
        this.msg = msg;
    }
    public static ResponseUtils Success(){

        success = ResponseEnum.SUCCESS.isSuccess();
        code = ResponseEnum.SUCCESS.getCode();
        msg = ResponseEnum.SUCCESS.getMsg();

        return new ResponseUtils(success, code, msg);
    }

    public static ResponseUtils Success(String msgStr){

        success = ResponseEnum.SUCCESS.isSuccess();
        code = ResponseEnum.SUCCESS.getCode();
        msg = msgStr;

        return new ResponseUtils(success, code, msg);
    }

    public static ResponseUtils FAIL(){

        success = ResponseEnum.FAIL.isSuccess();
        code = ResponseEnum.FAIL.getCode();
        msg = ResponseEnum.FAIL.getMsg();

        return new ResponseUtils(success, code, msg);
    }

    public static ResponseUtils FAIL(String msgStr){

        success = ResponseEnum.FAIL.isSuccess();
        code = ResponseEnum.ERROR.getCode();
        msg = msgStr;

        return new ResponseUtils(success, code, msg);
    }

    public static ResponseUtils ERROR(){

        success = ResponseEnum.ERROR.isSuccess();
        code = ResponseEnum.ERROR.getCode();
        msg = ResponseEnum.ERROR.getMsg();

        return new ResponseUtils(success, code, msg);
    }

    public static ResponseUtils ERROR(String msgStr){

        success = ResponseEnum.ERROR.isSuccess();
        code = ResponseEnum.ERROR.getCode();
        msg = msgStr;

        return new ResponseUtils(success, code, msg);
    }
}
