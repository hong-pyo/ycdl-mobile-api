package com.hong.repository;

import com.hong.domain.KakaoUserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by hong2 on 30/12/2018
 * Time : 6:14 PM
 */

public interface KakaoUserInfoRepository extends JpaRepository<KakaoUserInfo, Long> {
    KakaoUserInfo findByKakaoId(Long idx);
}
