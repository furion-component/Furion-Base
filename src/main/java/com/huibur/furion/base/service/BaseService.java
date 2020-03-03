package com.huibur.furion.base.service;

import com.huibur.furion.base.model.entity.DataGrid;
import com.huibur.furion.base.model.param.BaseParam;

import java.util.List;

/*******************************************************
 * Copyright(c)2019 - HuiBur .All rights reserved.
 * Header: BaseService.java
 * Discussion: base servive，Contains the basic add,delete,update,and search interfaces for single tables,
 *              and new feature interfaces for business modules
 *              eg: multi-table joint query, query results are not a single table entity,
 *              you can add in the business module Dao inheriting BaseService
 *     T do
 *     Q VO
 *     P query
 *     K primaryKey
 * Create Date: 2019/10/01
 * Author: Jerry Wen
 * Version: 1.0
 *******************************************************/
@SuppressWarnings("unused")
public interface BaseService<Q, P extends BaseParam, K> {
    /***
     * Name: insert
     * Discussion: insert data
     * @param record Vo
     * @return Q VO
     * @throws Exception e
     ***/
    Q insert(Q record) throws Exception;

    /***
     * Name: insertSelective
     * Discussion: select insert
     * @param record VO
     * @return Q VO
     * @throws Exception e
     ***/
    Q insertSelective(Q record) throws Exception;

    /***
     * Name: deleteByPrimaryKey
     * Discussion: delete record by primaryKey
     * @param primaryKey primaryKey
     * @return Integer
     * @throws Exception e
     ***/
    Integer deleteByPrimaryKey(K primaryKey) throws Exception;

    /***
     * Name: deleteByQueryRecord
     * Discussion: delete by query params
     * @param queryParams queryParams
     * @return Integer
     ***/
    //Integer deleteByQueryParams(P queryParams) throws Exception;

    /***
     * Name: updateByPrimaryKey
     * Discussion: update record
     * @param record VO
     * @return Q VO
     * @throws Exception e
     ***/
    Q updateByPrimaryKey(Q record) throws Exception;

    /***
     * Name: updateByPrimaryKeySelective
     * Discussion: select update record
     * @param record VO
     * @return Q VO
     * @throws Exception e
     ***/
    Q updateByPrimaryKeySelective(Q record) throws Exception;

    /***
     * Name: getByPrimaryKey
     * Discussion: select record by primaryKey
     * @param primaryKey DO
     * @return Q VO
     ***/
    Q getByPrimaryKey(K primaryKey);

    /***
     * Name: listByQueryParams
     * Discussion: list data
     * @param queryParams queryParams
     * @return DataGrid VO
     ***/
    DataGrid listByQueryParams(P queryParams) ;

    /***
     * Name: updateByPrimaryKeySelective
     * Discussion: count data
     * @param queryParams queryParams
     * @return Integer
     ***/
    Long countByQueryParams(P queryParams);

    /***
     * Name: batchInsertSelective
     * Discussion: batch insert data
     * @param records records
     *
     * @return long
     * @throws Exception e
     ***/
    long batchInsertSelective(List<Q> records) throws Exception;

    /***
     * Name: batchUpdateByPrimaryKeySelective
     * Discussion: batch update data
     * @param records records
     *
     * @return long
     * @throws Exception e
     ***/
    long batchUpdateByPrimaryKeySelective(List<Q> records) throws Exception;

    /***
     * Name: batchDeleteByPrimaryKey
     * Discussion: batch delete record
     * @param  primaryKeys list
     * @return long
     * @throws Exception e
     ***/
    long batchDeleteByPrimaryKeys(List<K> primaryKeys) throws Exception;
}
