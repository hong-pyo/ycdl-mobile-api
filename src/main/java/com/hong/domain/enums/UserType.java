package com.hong.domain.enums;

import lombok.Getter;

/**
 * Created by hong2 on 04/02/2019
 * Time : 3:43 PM
 */

@Getter
public enum UserType {
    KAKAO("kakaoType");


    private String signUpType;

    UserType(String signUpType) {
        this.signUpType = signUpType;
    }
}
