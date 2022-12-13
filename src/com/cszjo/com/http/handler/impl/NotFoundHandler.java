package com.cszjo.com.http.handler.impl;

import com.cszjo.com.http.context.Context;
import com.cszjo.com.http.context.Response;
import com.cszjo.com.http.handler.abs.AbstractHandler;
import org.apache.log4j.Logger;

/**
 * @Title: NotFoundHandler.java
 * @Description: 解决404NotFound响应
 * @author: Han
 * @date: 2016年7月16日 下午2:08:44
 */
public class NotFoundHandler extends AbstractHandler {

    private final Logger logger = Logger.getLogger(NotFoundHandler.class);
    private Response response;

    @Override
    public void doGet(Context context) {
        logger.info("进入了404Handler");
        response = context.getResponse();

        response.setStatuCode(404);
        response.setStatuCodeStr("Not Found");
        response.setHtmlFile("404.html");
    }
}
