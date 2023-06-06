package com.perry.myspring.boot;

import com.perry.myspring.web.WebServer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Collection;

/**
 * @author Perry Li
 * @date 2023/6/6
 * @desc
 */
public class MySpingApplication {
    public static void run(Class clazz) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(clazz);
        applicationContext.refresh();
        Collection<WebServer> servers = applicationContext.getBeansOfType(WebServer.class).values();
        if (servers.size() == 0) {
            System.err.println("Cannot find any web server");
        } else {
            servers.stream().findFirst().get().start();
        }
    }
}
