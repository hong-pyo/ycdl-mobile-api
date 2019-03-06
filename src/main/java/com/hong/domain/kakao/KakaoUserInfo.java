package com.hong.domain.kakao;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by hong2 on 30/12/2018
 * Time : 6:05 PM
 */

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class KakaoUserInfo implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String nickName;

    @Column
    @JsonProperty("id")
    private Long kakaoId;

    @Column
    private String profileImagePath;

    @Column
    private String thumbnailImagePath;

    @Column
    private LocalDateTime createDate;

    @Column
    private LocalDateTime latestVisitDate;

    @Column
    private long visited;

    @Builder
    public KakaoUserInfo(String nickName, Long kakaoId, String profileImagePath, String thumbnailImagePath, LocalDateTime createDate, LocalDateTime latestVisitDate, long visited) {
        this.nickName = nickName;
        this.kakaoId = kakaoId;
        this.profileImagePath = profileImagePath;
        this.thumbnailImagePath = thumbnailImagePath;
        this.createDate = createDate;
        this.latestVisitDate = latestVisitDate;
        this.visited = visited;
    }
}
