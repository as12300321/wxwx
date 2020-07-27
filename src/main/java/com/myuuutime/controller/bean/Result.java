package com.myuuutime.controller.bean;

/**
 * 向前端返回信息封装
 * @param <T> 可变类型
 */
public class Result<T> {
    //返回信息
    private String msg;
    //数据是否正常请求
    private boolean success;
    //具体返回的数据
    private T detail;

    public void setSuccess(boolean b) {
    }

    public void setDetail(Object o) {
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
    //... getter and setter
}
