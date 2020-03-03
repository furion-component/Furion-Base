package com.huibur.furion.base.model.entity;

import java.math.BigInteger;

/*******************************************************
 * Copyright(c)2019 - HuiBur .All rights reserved.
 * Header: BaseTreeEntity.java
 * Discussion: Tree structure
 * Create Date: 2019/06/05
 * Author: Jerry Wen
 * Version: 1.0
 *******************************************************/
public abstract class BaseTreeEntity<T extends BaseTreeEntity> {
    protected BigInteger id;
    protected String name;
    protected BigInteger parentId;
    protected T parent;

    private BaseTreeEntity() {

    }

    public BigInteger getId() {
        return this.id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getParentId() {
        return this.parentId;
    }

    public void setParentId(BigInteger parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getParent() {
        return this.parent;
    }

    public void setParent(T parent) {
        this.parent = parent;
    }
}
