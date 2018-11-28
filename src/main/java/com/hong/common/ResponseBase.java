package com.hong.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by hong2 on 29/11/2018
 * Time : 1:14 AM
 */
@Data
@SuppressWarnings("PMD.UnusedPrivateField")
public abstract class ResponseBase<T> {
    @JsonProperty("rCode")
    private String code = ErrorCodes.SUCCESS;
    @JsonProperty("rMessage")
    private String message = ErrorMessages.SUCCESS;
    @JsonProperty("rData")
    private T data;
}
