package com.hong.domain;

import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by hong2 on 04/02/2019
 * Time : 3:55 PM
 */

@Getter
@Entity
@NoArgsConstructor
@Table(name = "video_content")
@ApiModel(value = "video_content")
public class VideoContent {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String title;

    @Column
    private String question;

    @Column
    private String answer;

    @Column
    private Long level;

    @Column
    private Long success;

    @Column
    private Long fail;

    @Column
    private Long count;

    @Column
    private LocalDateTime createDate;

    @Column
    private LocalDateTime updatedDate;

    @ManyToOne
    @JoinColumn(name = "video_category_id", insertable = false, updatable = false)
    private VideoCategory videoCategory;
}
