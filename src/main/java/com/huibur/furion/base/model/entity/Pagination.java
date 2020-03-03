package com.huibur.furion.base.model.entity;

/*******************************************************
 * Copyright(c)2019-2019 HuiBur. All rights reserved.
 * Header: Pagination.java
 * Discussion: pagination structure
 * Create Date: 2019/7/17
 * Author: Jerry Wen
 * Version: 1.0
 *******************************************************/
public class Pagination {
    /**
     * record total num
     */
    private int total;
    /**
     * current page num
     */
    private int pageNum;
    /**
     * per page size of record
     */
    private int pageSize;
    /**
     * is first page
     */
    private boolean isFirstPage= false;
    /**
     * is last page
     */
    private boolean isLastPage= false;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int current) {
        this.pageNum = current;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean getIsFirstPage() {
        return isFirstPage;
    }

    public void setFirstPage(boolean firstPage) {
        isFirstPage = firstPage;
    }

    public boolean getIsLastPage() {
        return isLastPage;
    }

    public void setLastPage(boolean lastPage) {
        isLastPage = lastPage;
    }
}
