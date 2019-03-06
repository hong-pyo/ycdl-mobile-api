package com.hong.controller;

import com.hong.common.ResponseBase;
import com.hong.domain.kakao.KakaoUserInfo;
import com.hong.domain.SimpleResponse;
import com.hong.domain.kakao.LinkMessage;
import com.hong.service.kakao.KakaoLinkMessageService;
import com.hong.service.kakao.KakaoUserService;
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
public class KakaoController {

    @Autowired
    private KakaoUserService kakaoUserService;
    @Autowired
    private KakaoLinkMessageService linkMessageService;


    @RequestMapping(value = "/sign-up", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseBase signUp(@Validated @RequestBody KakaoUserInfo kakaoUserInfo) {
        ResponseBase<String> responseBase = new SimpleResponse<>();
        responseBase.setData(kakaoUserService.signUp(kakaoUserInfo));
        return responseBase;
    }

    @RequestMapping(value = "/link", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseBase linkMessage(@Validated @RequestBody KakaoUserInfo kakaoUserInfo) {
        ResponseBase<LinkMessage> responseBase = new SimpleResponse<>();
        responseBase.setData(linkMessageService.getLinkMesage(kakaoUserInfo));
        return responseBase;
    }
}
