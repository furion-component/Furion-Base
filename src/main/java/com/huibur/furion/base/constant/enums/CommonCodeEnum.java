package com.huibur.furion.base.constant.enums;

import com.huibur.furion.base.interfaces.ErrorCode;

/*******************************************************
 * Copyright(c)2019-2020 HuiBur. All rights reserved.
 * Header: CodeEnum.java
 * Discussion: common code enum
 * Create Date: 2020/3/2
 * Author: Jerry Wen
 * Version: 1.0
 *******************************************************/
@SuppressWarnings("unused")
public enum CommonCodeEnum implements ErrorCode {
    /**
     * success
     */
    SUCCESS(200, "success"),
    /**
     * failed
     */
    FAILED(210, "failed"),
    /**
     * request params is error
     */
    REQUEST_PARAM_ERROR(400, "request params is error"),
    /**
     * no service
     */
    NO_SERVICE(404, "no service"),
    /**
     * server internal error
     */
    UNSPECIFIED(500, "server internal error"),
    /**
     * page num is null
     */
    PAGE_NUM_IS_NULL(4001,"page num is null"),
    /**
     * page size is null
     */
    PAGE_SIZE_IS_NULL(4002,"page size is null"),
    /**
     * id is null
     */
    ID_IS_NULL(4003,"id is null"),
    /**
     * query param is null
     */
    SEARCH_IS_NULL(4004,"query param is null"),
    /**
     * data is existed
     */
    DATA_IS_EXISTED(4005, "data is existed"),
    /**
     * data is not exist
     */
    DATA_IS_NOT_EXISTED(4006, "data is not existed");

    private final int code;
    private final String desc;

    CommonCodeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getDesc() {
        return desc;
    }
}