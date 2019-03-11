package com.hong.controller;

import com.hong.common.ResponseBase;
import com.hong.domain.AlertMessage;
import com.hong.domain.SimpleResponse;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/alertMessage", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseBase alertMessage(@Validated @RequestBody Double appVersion) {
        ResponseBase<AlertMessage> responseBase = new SimpleResponse<>();
        String message = "YCDL 을 이용해 주셔서 감사합니다. \n" +
                "새로운 아이디어를 내주시면 감사하겠습니다. \n" +
                "email : hong2_dev@naver.com";

        if (appVersion.equals(1.0)) {
            responseBase.setData(AlertMessage.builder()
                    .title("YCDL")
                    .message(message)
                    .build());
        }
        return responseBase;
    }
}
