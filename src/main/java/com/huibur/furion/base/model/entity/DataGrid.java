package com.huibur.furion.base.model.entity;

import java.io.Serializable;
import java.util.List;

/*******************************************************
 * Copyright(c)2019 - HuiBur .All rights reserved.
 * Header: DataGrid.java
 * Discussion: list data by pagination structure
 * Create Date: 2019/10/01
 * Author: Jerry Wen
 * Version: 1.0
 *******************************************************/
public class DataGrid<T> implements Serializable {
    /**
     * pagination structure
     */
    private Pagination pagination;
    /**
     * list object
     */
    private List<T> list;

    public DataGrid(Pagination pagination, List<T> rows) {
        this.pagination = pagination;
        this.list = rows;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
