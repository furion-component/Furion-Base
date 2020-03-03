package com.huibur.furion.base.model.query;

import com.huibur.furion.base.constant.enums.SqlExecTypeEnum;
import com.huibur.furion.base.model.param.BaseParam;

import java.util.ArrayList;
import java.util.List;

/*******************************************************
 * Copyright(c)2019 - HuiBur .All rights reserved.
 * Header: BaseQuery.java
 * Discussion: base query model
 * Create Date: 2018/08/01
 * Author: Jerry Wen
 * Version: 1.0
 *******************************************************/
@SuppressWarnings("unused")
public abstract class BaseQuery {
    /**
     * current page num
     */
    protected Integer pageNum;
    /**
     * per page size
     */
    protected Integer pageSize;
    /**
     * sort param
     */
    protected String sort;
    /**
     * order (desc, asc)
     */
    protected String order;

    protected BaseQuery() {

    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
