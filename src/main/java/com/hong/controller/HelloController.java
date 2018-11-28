package com.hong.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hong2 on 11/11/2018
 * Time : 11:50 PM
 */

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello hongE world";
    }
}
