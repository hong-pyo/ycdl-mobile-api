package com.hong.common.util;

/**
 * Created by hong2 on 18/02/2019
 * Time : 1:34 AM
 */

public class HongStringUtil {
    public static boolean isBlank(String s) {
        if (s == null) {
            return true;
        }

        if (s.equals("") || s.length() == 0 || s.equals("null")) {
            return true;
        }

        return false;
    }
}
