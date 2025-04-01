package com.gem.common;

public class Result {
    private String code;
    private String msg;
    private Object data;

    private Result(Object data) {
        this.data = data;
    }

    public Result() {
    }

    public static Result success() {
        Result res = new Result();
        res.setCode(ResultCode.SUCCESS.code);
        res.setMsg(ResultCode.SUCCESS.msg);
        return res;
    }

    public static Result success(Object data) {
        Result res = new Result(data);
        res.setCode(ResultCode.SUCCESS.code);
        res.setMsg(ResultCode.SUCCESS.msg);
        return res;
    }

    public static Result error() {
        Result res = new Result();
        res.setCode(ResultCode.SYSTEM_ERROR.code);
        res.setMsg(ResultCode.SYSTEM_ERROR.msg);
        return res;
    }

    public static Result error(String code, String msg) {
        Result res = new Result();
        res.setCode(code);
        res.setMsg(msg);
        return res;
    }

    public static Result error(ResultCode resultCode) {
        Result res = new Result();
        res.setCode(resultCode.code);
        res.setMsg(resultCode.msg);
        return res;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
