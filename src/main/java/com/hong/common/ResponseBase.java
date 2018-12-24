package com.hong.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hong.common.constant.RCodeContant;
import lombok.Data;

/**
 * Created by hong2 on 29/11/2018
 * Time : 1:14 AM
 */
@Data
@SuppressWarnings("PMD.UnusedPrivateField")
public abstract class ResponseBase<T> {
    @JsonProperty("rCode")
    private String code = RCodeContant.CODE.SUCCESS;
    @JsonProperty("rMessage")
    private String message = RCodeContant.MSG.SUCCESS;
    @JsonProperty("rData")
    private T data;
}
