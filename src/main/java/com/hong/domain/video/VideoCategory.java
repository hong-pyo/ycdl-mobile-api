package com.hong.domain.video;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hong2 on 04/02/2019
 * Time : 3:37 PM
 */

@Getter
@Entity
@NoArgsConstructor
@Table(name = "video_category")
@ApiModel(value = "video_category")
public class VideoCategory implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String name;

    @Column
    private String displayTitle;

    @JsonIgnore
    @OneToMany(mappedBy = "videoCategory", targetEntity = VideoContent.class)
    private List<VideoContent> videoContent = new ArrayList<>();
}

