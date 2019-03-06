package com.hong.domain.kakao;

import lombok.Builder;
import lombok.Getter;

/**
 * Created by hong2 on 06/03/2019
 * Time : 11:39 PM
 */

@Getter
@Builder
public class LinkMessage {
    private String title;
    private String imageUrl;
    private String webUrl;
    private String appUrl;
    private String description;
}
