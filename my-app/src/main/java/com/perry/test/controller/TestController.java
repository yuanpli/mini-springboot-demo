package com.perry.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Perry Li
 * @date 2023/6/6
 * @desc
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "Hello Spring.";
    }
}
