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
        String imageUrl = "http://k.kakaocdn.net/dn/4Gh9a/btqs1Q4Jn6u/zBCbKIpCaSxdqioDcZH8fk/kakaolink40_original.png";
        String webUrl = "";
        String appUrl = "";
        String descriptionFormat = "%s 님꼐서 당신을 YCDL 로 초대하였습니다."; /*+
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
