package com.huibur.furion.base.constant.enums;

/*******************************************************
 * Copyright(c)2019-2020 HuiBur .All rights reserved.
 * Header: StatusEnum.java
 * Discussion: status enum
 * Create Date: 2019/10/01
 * Author: Jerry Wen
 * Version: 1.0
 *******************************************************/
@SuppressWarnings("unused")
public enum StatusEnum {
    /**
     * normal
     */
    NORMAL(0, "normal"),
    /**
     * deleted
     */
    DELETED(1, "deleted"),
    /**
     * frozen
     */
    FROZEN(2, "frozen"),
    /**
     * disabled
     */
    DISABLED(3, "disabled");

    private int code;
    private String desc;

    StatusEnum(int value, String desc) {
        this.code = value;
        this.desc = desc;
    }

    public int getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }
}
