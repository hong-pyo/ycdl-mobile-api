package com.hong.domain.enums;

import lombok.Getter;

/**
 * Created by hong2 on 2018. 10. 28.
 * Time : AM 2:41
 */

@Getter
public enum BoardType {
    notice("공지사항"),
    free("자유 게시판");
    private String value;

    BoardType(String value) {
        this.value = value;
    }
}
