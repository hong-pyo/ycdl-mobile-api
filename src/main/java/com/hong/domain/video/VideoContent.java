package com.hong.domain.video;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by hong2 on 04/02/2019
 * Time : 3:55 PM
 */

@Setter
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
    private String link;

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

    @ManyToOne(targetEntity = VideoCategory.class)
    @JoinColumn(name = "video_category_idx")
    private VideoCategory videoCategory;
}
