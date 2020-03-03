package com.huibur.furion.base.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*******************************************************
 * Copyright(c)2019 - HuiBur .All rights reserved.
 * Header: BaseController.java
 * Discussion: base controller
 * Create Date: 2019/06/05
 * Author: Jerry Wen
 * Version: 1.0
 *******************************************************/
@SuppressWarnings("unused")
public abstract class BaseController {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    public BaseController() {
    }

    /***
     * Name: getRequest
     * Discussion: request handler
     * @return  HttpServletRequest
     ***/
    protected HttpServletRequest getRequest() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return requestAttributes == null ? null : requestAttributes.getRequest();
    }

    /***
     * Name: getResponse
     * Discussion: response handler
     * @return HttpServletResponse
     ***/
    protected HttpServletResponse getResponse() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return requestAttributes == null ? null : requestAttributes.getResponse();
    }

}
