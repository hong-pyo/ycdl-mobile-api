package com.hong.service.kakao;


import com.hong.domain.kakao.KakaoUserInfo;
import com.hong.domain.kakao.LinkMessage;
import org.springframework.stereotype.Service;

/**
 * Created by hong2 on 06/03/2019
 * Time : 11:42 PM
 */

@Service
public class KakaoLinkMessageService {

    public LinkMessage getLinkMesage(KakaoUserInfo kakaoUserVO) {
        String title = "YCDL 알리기";
        String imageUrl = "http://k.kakaocdn.net/dn/b0F7KT/btqtaWcoCYt/9G6U2gWw1UbyszhrRSN3k1/kakaolink40_original.png";
        String webUrl = "https://play.google.com/store/apps/details?id=com.hong2.ycdl2";
        String appUrl = "https://play.google.com/store/apps/details?id=com.hong2.ycdl2";
        String descriptionFormat = "%s 님께서 당신을 YCDL 로 초대하였습니다."; /*+
                " \n YCDL 로 구화학습을 해보세요~" +
                "\n YCDL 은 You Can (Do) Listen 의 줄임말로 " +
                "\n 당신도 들을 수 있다!, 당신도 듣다! 입니다.";*/

        LinkMessage linkMessage = LinkMessage.builder()
                .title(title)
                .imageUrl(imageUrl)
                .webUrl(webUrl)
                .appUrl(appUrl)
                .description(String.format(descriptionFormat, kakaoUserVO.getNickName()))
                .build();

        return linkMessage;
    }
}
