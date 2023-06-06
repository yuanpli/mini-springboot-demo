package com.perry.myspring.boot;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author Perry Li
 * @date 2023/6/6
 * @desc
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(MyAutoConfiguration.class)
public @interface MySpringBootApplication {

}
