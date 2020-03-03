package com.huibur.furion.base.model.param;

/*******************************************************
 * Copyright(c)2019-2020 HuiBur .All rights reserved.
 * Header: BaseParam.java
 * Discussion: base param for controller receive data
 * Create Date: 2019/10/01
 * Author: Jerry Wen
 * Version: 1.0
 *******************************************************/
public abstract class BaseParam {
    /**
     * create time
     */
    protected Integer createAt;

    protected BaseParam() {
    }

    protected Integer getCreateAt() {
        return createAt;
    }

    protected void setCreateAt(Integer createAt) {
        this.createAt = createAt;
    }
}
