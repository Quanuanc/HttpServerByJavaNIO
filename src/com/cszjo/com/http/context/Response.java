package com.cszjo.com.http.context;

import com.cszjo.com.http.utils.XMLUtil;

import java.nio.channels.SelectionKey;

/**
 * @Title: Response.java
 * @Description: 接口设计：response接口
 * @author: Han
 * @date: 2016年7月16日 下午2:19:25
 */
public interface Response {

    //服务器名字
    String SERVER_NAME = XMLUtil.getRootElement("server.xml").element("serverName").getText();

    String getContentType();

    void setContentType(String contentType);

    int getStatuCode();

    void setStatuCode(int statuCode);

    String getStatuCodeStr();

    void setStatuCodeStr(String statuCodeStr);

    String getHtmlFile();

    void setHtmlFile(String htmlFile);

    SelectionKey getKey();
}
