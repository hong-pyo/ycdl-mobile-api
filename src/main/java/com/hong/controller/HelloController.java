package com.hong.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hong2 on 11/11/2018
 * Time : 11:50 PM
 */

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "hongE";
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.POST)
    public String welcome(@RequestParam String memberNickName) {
        return "Welcome " + memberNickName;
    }
}
