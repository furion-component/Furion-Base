package com.huibur.furion.base.model.entity;

import com.huibur.furion.base.interfaces.ErrorCode;

import java.io.Serializable;

/*******************************************************
 * Copyright(c)2019-2020 HuiBur .All rights reserved.
 * Header: ResponseResult.java
 * Discussion: http response result data structure
 * Create Date: 2019/06/05
 * Author: Jerry Wen
 * Version: 1.0
 *******************************************************/
@SuppressWarnings("unused")
public class ResponseResult<T> implements Serializable {
    private int code;
    private String msg;
    private T data;

    public ResponseResult(ErrorCode code) {
        this.code = code.getCode();
        this.msg = code.getDesc();
    }

    public ResponseResult(ErrorCode code, T data) {
        this.code = code.getCode();
        this.msg = code.getDesc();
        this.data = data;
    }

    public ResponseResult(int code, String message, T data) {
        this.code = code;
        this.msg = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                "\"code\":" + code +
                ", \"msg\":\"" + msg + '\"' +
                ", \"data\":\"" + data + '\"'+
                '}';
    }
}
