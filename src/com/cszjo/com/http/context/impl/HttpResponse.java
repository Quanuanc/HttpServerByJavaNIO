package com.cszjo.com.http.context.impl;

import com.cszjo.com.http.context.Response;

import java.nio.channels.SelectionKey;

/**
 * @Title: HttpResponse.java
 * @Description: http响应
 * @author: Han
 * @date: 2016年7月16日 下午2:20:41
 */
public class HttpResponse implements Response {

    private final SelectionKey key;
    //内容类型  defalut 为text/html
    private String contentType = "text/html";
    //响应码  defalut 为200
    private int StatuCode = 200;
    private String statuCodeStr = "OK";
    private String htmlFile = "";

    public HttpResponse(SelectionKey key) {
        this.key = key;
    }

    @Override
    public String getContentType() {
        return contentType;
    }

    @Override
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @Override
    public int getStatuCode() {
        return StatuCode;
    }

    @Override
    public void setStatuCode(int statuCode) {
        StatuCode = statuCode;
    }

    @Override
    public SelectionKey getKey() {
        return key;
    }

    @Override
    public String getStatuCodeStr() {
        return statuCodeStr;
    }

    @Override
    public void setStatuCodeStr(String statuCodeStr) {
        this.statuCodeStr = statuCodeStr;
    }

    @Override
    public String getHtmlFile() {
        return htmlFile;
    }

    @Override
    public void setHtmlFile(String htmlFile) {
        this.htmlFile = htmlFile;
    }
}
