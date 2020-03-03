package com.huibur.furion.base.mapper;

import com.huibur.furion.base.model.query.BaseQuery;

import java.util.List;

/*******************************************************
 * Copyright(c)2019-2020 HuiBur .All rights reserved.
 * Header: BaseMapper.java
 * Discussion: base mapper，Contains the basic add,delete,update,and search interfaces for single tables,
 *              and new feature interfaces for business modules
 *              eg: multi-table joint query, query results are not a single table entity,
 *              you can add in the business module Dao inheriting BaseDao
 *   T DO(data for mapper to service)
 *   K primaryKey
 * Create Date: 2019/10/01
 * Author: Jerry Wen
 * Version: 1.0
 *******************************************************/
@SuppressWarnings("unused")
public interface BaseMapper<T, K> {
    /***
     * Name: insert
     * Discussion: insert record
     * @param  record table orm do
     * @return  int
     ***/
    int insert(T record);
    /***
     * Name: insertSelective
     * Discussion: select insert
     * @param record DO object
     * @return  int
     ***/
    int insertSelective(T record);

    /***
     * Name: deleteByPrimaryKey
     * Discussion: delete record by primaryKey
     * @param primaryKey primaryKey
     * @return  int
     ***/
    int deleteByPrimaryKey(K primaryKey);

    /***
     * Name: deleteByQueryRecord
     * Discussion: delete by query params
     * @param query queryParams
     * @return  int
     ***/
    int deleteByQueryParams(BaseQuery query);

    /***
     * Name: updateByPrimaryKey
     * Discussion: update record
     * @param record record
     * @return  int
     ***/
    int updateByPrimaryKey(T record);

    /***
     * Name: updateByPrimaryKeySelective
     * Discussion: select update record
     * @param record record
     * @return  int
     ***/
    int updateByPrimaryKeySelective(T record);

    /***
     * Name: getByPrimaryKey
     * Discussion: select record by primaryKey
     * @param primaryKey primaryKey
     * @return  int
     ***/
    T getByPrimaryKey(K primaryKey);

    /***
     * Name: listByQueryParams
     * Discussion: list data
     * @param query queryParams
     * @return  int
     ***/
    List<T> listByQueryParams(BaseQuery query);

    /***
     * Name: updateByPrimaryKeySelective
     * Discussion: count data
     * @param query queryParams
     * @return  long
     ***/
    long countByQueryParams(BaseQuery query);

    /***
     * Name: batchInsertSelective
     * Discussion: batch insert data
     * @param records records
     * @return  long
     ***/
    long batchInsertSelective(List<T> records);

    /***
     * Name: batchUpdateByPrimaryKeySelective
     * Discussion: batch update data
     * @param records records
     * @return  long
     ***/
    long batchUpdateByPrimaryKeySelective(List<T> records);

    /***
     * Name: batchDeleteByPrimaryKey
     * Discussion: batch delete record
     * @param  primaryKeys primaryKeys
     * @return  long
     ***/
    long batchDeleteByPrimaryKeys(List<K> primaryKeys);
}