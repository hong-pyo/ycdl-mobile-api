package com.hong.controller;

import com.hong.common.ResponseBase;
import com.hong.domain.SimpleResponse;
import com.hong.domain.VideoCategory;
import com.hong.service.VideoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hong2 on 04/02/2019
 * Time : 3:42 PM
 */

@RestController
@Api(description = "video list")
@RequestMapping("/video")
public class VideoController {
    @Autowired
    private VideoService videoService;

    @ApiOperation(value = "video cateogry 조회", notes = "<pre> video list 전체 조회")
    @RequestMapping(value = "/category/all", method = RequestMethod.GET)
    public ResponseBase getVideoCategory() {
        ResponseBase<List<VideoCategory>> result = new SimpleResponse<>();
        List<VideoCategory> videoCategories = videoService.getVideoCategoryList();

        result.setData(videoCategories);

        return result;

    }
}
