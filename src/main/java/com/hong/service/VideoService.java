package com.hong.service;

import com.hong.domain.VideoCategory;
import com.hong.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by hong2 on 04/02/2019
 * Time : 3:53 PM
 */

@Service
public class VideoService {

    @Autowired
    private VideoRepository videoRepository;

    public List<String> getVideoCategoryList() {
        List<VideoCategory> categoryList = videoRepository.findAll();
        return categoryList.stream()
                .filter(Objects::nonNull)
                .map(VideoCategory::getDisplayTitle)
                .collect(Collectors.toList());
    }
}
