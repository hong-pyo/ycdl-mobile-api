package com.hong.domain;

import lombok.Builder;
import lombok.Getter;

/**
 * Created by hong2 on 11/03/2019
 * Time : 11:04 PM
 */

@Getter
@Builder
public class AlertMessage {
    private String title;
    private String message;
}
