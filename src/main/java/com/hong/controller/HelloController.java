package com.hong.controller;

import com.hong.common.ErrorResultDto;
import com.hong.common.ResponseBase;
import com.hong.domain.AlertMessage;
import com.hong.domain.SimpleResponse;
import com.hong.service.AlertMessageService;
import com.hong.service.ErrorResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Created by hong2 on 11/11/2018
 * Time : 11:50 PM
 */

@RestController
public class HelloController {

    @Autowired
    private ErrorResultService errorResultService;
    @Autowired
    private AlertMessageService alertMessageService;

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

        responseBase.setData(alertMessageService.findByVersion(appVersion));

        return responseBase;
    }

    @RequestMapping(value = "/fail", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseBase error(@Validated @RequestBody ErrorResultDto errorResultDto) {
        ResponseBase<ErrorResultDto> responseBase = new SimpleResponse<>();
        errorResultService.update(errorResultDto);
        responseBase.setData(errorResultDto);
        return responseBase;
    }
}
