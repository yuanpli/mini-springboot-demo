package com.perry.myspring.web;

/**
 * @author Perry Li
 * @date 2023/6/6
 * @desc
 */
public class TomcatWebServer implements WebServer{
    @Override
    public void start() {
        System.out.println("Start Tomcat Server");
    }

    @Override
    public void stop() {

    }
}
