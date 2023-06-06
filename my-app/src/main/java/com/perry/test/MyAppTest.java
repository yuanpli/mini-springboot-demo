package com.perry.test;

import com.perry.myspring.boot.MySpingApplication;
import com.perry.myspring.boot.MySpringBootApplication;
/**
 * @author Perry Li
 * @date 2023/6/6
 * @desc
 */
@MySpringBootApplication
public class MyAppTest {
    public static void main(String[] args) {
        MySpingApplication.run(MyAppTest.class);
    }
}
