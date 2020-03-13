package com.huibur.furion.base.util;

import com.huibur.furion.base.constant.enums.CommonCodeEnum;
import com.huibur.furion.base.interfaces.ErrorCode;
import com.huibur.furion.base.model.entity.ResponseResult;

/*******************************************************
 * Copyright(c)2019-2020 HuiBur .All rights reserved.
 * Header: ResultBuilder.java
 * Discussion: http response success or fail
 * Create Date: 2019/06/05
 * Author: Jerry Wen
 * Version: 1.0
 *******************************************************/
@SuppressWarnings("unused")
public class ResultBuilder {

    public static ResponseResult success() {
        return success(CommonCodeEnum.SUCCESS);
    }

    public static ResponseResult success(ErrorCode code) {
        return success(code, null);
    }

    public static <T> ResponseResult<T> success(T t) {
        return success(CommonCodeEnum.SUCCESS, t);
    }

    public static <T> ResponseResult<T> success(ErrorCode code, T t) {
        return new ResponseResult<>(code.getCode(), code.getDesc(), t);
    }

    public static ResponseResult fail() {
        return fail(CommonCodeEnum.FAILED);
    }

    public static ResponseResult fail(ErrorCode code) {
        return fail(code, null);
    }

    public static <T> ResponseResult<T> fail(ErrorCode code, T t) {
        return new ResponseResult<>(code.getCode(), code.getDesc(), t);
    }
}
