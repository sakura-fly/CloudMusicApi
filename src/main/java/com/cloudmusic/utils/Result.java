package com.cloudmusic.utils;

/**
 * 错误提示
 * Created by xuzijia
 * 2018/5/20 19:53
 */
public class Result {
    private Integer code;
    private String msg;

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
