package com.hong.service.kakao;

import com.hong.domain.kakao.KakaoUserInfo;
import com.hong.repository.KakaoUserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;


/**
 * Created by hong2 on 30/12/2018
 * Time : 6:44 PM
 */

@Service
public class KakaoUserService {

    @Autowired
    private KakaoUserInfoRepository kakaoUserInfoRepository;

    public String signUp(KakaoUserInfo kakaoUserVO) {

        Optional<KakaoUserInfo> kakaoUserInfo = Optional.ofNullable(kakaoUserInfoRepository.findByKakaoId(kakaoUserVO.getKakaoId()));

        if(kakaoUserInfo.isPresent()) {
            updateUserInfo(kakaoUserInfo);
            return "이미 가입된 회원입니다.";
        } else {
            saveUserInfo(kakaoUserVO);
            return "회원 가입을 하였습니다.";
        }
    }

    private void saveUserInfo(KakaoUserInfo kakaoUserVO) {
        kakaoUserInfoRepository.save(KakaoUserInfo.builder()
                .nickName(kakaoUserVO.getNickName())
                .kakaoId(kakaoUserVO.getKakaoId())
                .profileImagePath(kakaoUserVO.getProfileImagePath())
                .thumbnailImagePath(kakaoUserVO.getThumbnailImagePath())
                .createDate(LocalDateTime.now())
                .latestVisitDate(LocalDateTime.now())
                .visited(1)
                .build());
    }

    private void updateUserInfo(Optional<KakaoUserInfo> kakaoUserInfo) {
        KakaoUserInfo userInfo = kakaoUserInfo.get();
        userInfo.setLatestVisitDate(LocalDateTime.now());
        userInfo.setProfileImagePath(userInfo.getProfileImagePath());
        userInfo.setThumbnailImagePath(userInfo.getProfileImagePath());
        userInfo.setVisited(userInfo.getVisited() + 1);
        kakaoUserInfoRepository.save(userInfo);
    }
}
