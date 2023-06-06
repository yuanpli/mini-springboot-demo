package com.perry.myspring.boot;

import com.perry.myspring.web.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author Perry Li
 * @date 2023/6/6
 * @desc
 */
@Configuration
public class MyAutoConfiguration {

    @Bean
    @Conditional(TomcatCondition.class)
    public WebServer TomcatWebServer() {
        return new TomcatWebServer();
    }

    @Bean
    @Conditional({JettyCondition.class})
    public WebServer JettyWebServer() {
        return new JettyWebServer();
    }
}
