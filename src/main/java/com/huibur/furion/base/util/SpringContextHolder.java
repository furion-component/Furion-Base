package com.huibur.furion.base.util;

import org.apache.commons.lang3.Validate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletRequest;

/*******************************************************
 * Copyright(c)2019-2020 HuiBur .All rights reserved.
 * Header: SpringContextHolder.java
 * Discussion: spring context holder
 * Create Date: 2019/06/05
 * Author: Jerry Wen
 * Version: 1.0
 *******************************************************/
@Component
public class SpringContextHolder implements ApplicationContextAware {
    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        context = applicationContext;
    }

    public static <T> T getBean(Class<T> clazz) {
        try {
            return (T) getApplicationContext().getBean(clazz);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T> T getBean(String name) {
        return (T) getApplicationContext().getBean(name);
    }

    public static ApplicationContext getApplicationContext() {
        Validate.validState(context != null, "applicaitonContext", new Object[0]);
        return context;
    }

    public static HttpServletRequest getHttpServletRequest(){
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return requestAttributes == null ? null : requestAttributes.getRequest();
    }
}
