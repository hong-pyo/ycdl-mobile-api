package com.hong.domain;

import com.hong.common.ResponseBase;
import com.hong.common.constant.RCodeContant;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by hong2 on 29/11/2018
 * Time : 1:22 AM
 */
@Getter
@Setter
public class SimpleResponse<T> extends ResponseBase<T> {

    public SimpleResponse() {
        setCode(RCodeContant.CODE.SUCCESS);
        setMessage(RCodeContant.MSG.SUCCESS);
    }

    public static final SimpleResponse SYSTEM_ERR = new SimpleResponse() {
        {
         setCode(RCodeContant.CODE.SYSTEM_ERR);
         setMessage(RCodeContant.MSG.SUCCESS);
        }
    };

    public static SimpleResponse getCustomError(final String code, final String message) {
        return new SimpleResponse() {
            {
                setCode(code);
                setMessage(message);
            }
        };
    }
}

