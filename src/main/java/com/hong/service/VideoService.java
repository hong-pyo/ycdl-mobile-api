package com.hong.service;

import com.hong.domain.video.VideoCategory;
import com.hong.domain.video.VideoContent;
import com.hong.repository.VideoContentsRepository;
import com.hong.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by hong2 on 04/02/2019
 * Time : 3:53 PM
 */

@Service
public class VideoService {

    @Autowired
    private VideoRepository videoRepository;
    @Autowired
    private VideoContentsRepository videoContentsRepository;

    public List<VideoCategory> getVideoCategoryList() {
        return videoRepository.findAll();

    }

    public VideoContent addVideoLink(VideoContent videoContent) {
        VideoContent content = videoContent;
        content.setCount(0L);
        content.setFail(0L);
        content.setSuccess(0L);
        content.setCreateDate(LocalDateTime.now());
        content.setUpdatedDate(LocalDateTime.now());
        return videoContentsRepository.save(content);
    }

    public VideoCategory addCategory(VideoCategory videoCategory) {
        return videoRepository.save(videoCategory);
    }
}
