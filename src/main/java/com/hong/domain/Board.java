package com.hong.domain;

import com.hong.domain.enums.BoardType;
import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by hong2 on 2018. 10. 28.
 * Time : AM 2:44
 */

@Getter
@NoArgsConstructor
@Entity
@Table
@ApiModel(value = "게시판 보드")
public class Board implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String title;

    @Column
    private String subTitle;

    @Column
    private String content;

    @Column
    @Enumerated(EnumType.STRING)
    private BoardType boardType;

    @Column
    private LocalDateTime createDate;

    @Column
    private LocalDateTime updatedDate;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;

    @Builder
    public Board(String title, String subTitle, String content, BoardType boardType,
                 LocalDateTime createDate, LocalDateTime updatedDate, User user) {
        this.title = title;
        this.subTitle = subTitle;
        this.content = content;
        this.boardType = boardType;
        this.createDate = createDate;
        this.updatedDate = updatedDate;
        this.user = user;
    }
}
