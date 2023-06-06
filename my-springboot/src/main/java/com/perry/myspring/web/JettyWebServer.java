package com.perry.myspring.web;

/**
 * @author Perry Li
 * @date 2023/6/6
 * @desc
 */
public class JettyWebServer implements WebServer{
    @Override
    public void start() {
        System.out.println("Start Jetty Server");
    }

    @Override
    public void stop() {

    }
}
