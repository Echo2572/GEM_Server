package com.gem.common;

public enum ResultCode {
    SUCCESS("200","成功"),

    PARAM_ERROR("400", "参数异常"),
    PARAM_LOST_ERROR("4001","参数缺失"),

    SYSTEM_ERROR("500","系统异常"),
    USER_EXIST_ERROR("5001","用户名已存在"),
    USER_NOT_LOGIN("5002","用户未登录"),
    USER_ACCOUNT_ERROR("5003","账号或密码错误"),
    USER_NOT_EXIST_ERROR("5004","用户不存在"),
    PARAM_PASSWORD_ERROR("5005","原密码输入错误"),

    INVALID_ERROR("600", "无效的token");

    public String code;
    public String msg;

    ResultCode(String code, String msg){
        this.code=code;
        this.msg=msg;
    }
}
