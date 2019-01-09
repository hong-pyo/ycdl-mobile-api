package com.hong.controller;

import com.hong.common.ResponseBase;
import com.hong.domain.KakaoUserInfo;
import com.hong.domain.SimpleResponse;
import com.hong.service.KakaoUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Created by hong2 on 30/12/2018
 * Time : 6:45 PM
 */

@RestController
@RequestMapping("/kakao")
public class KakaoUserController {

    @Autowired
    private KakaoUserService kakaoUserService;


    @RequestMapping(value = "/sign-up", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseBase signUp(@Validated @RequestBody KakaoUserInfo kakaoUserInfo) {
        ResponseBase<String> responseBase = new SimpleResponse<>();
        responseBase.setData(kakaoUserService.signUp(kakaoUserInfo));
        return responseBase;
    }
}
