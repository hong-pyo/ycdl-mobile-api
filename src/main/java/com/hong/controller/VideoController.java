package com.hong.controller;

import com.hong.common.ResponseBase;
import com.hong.common.util.HongStringUtil;
import com.hong.domain.SimpleResponse;
import com.hong.domain.video.VideoCategory;
import com.hong.domain.video.VideoContent;
import com.hong.service.VideoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

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
        videoCategories = videoCategories.stream().filter(e -> !HongStringUtil.isBlank(e.getDisplayTitle())).collect(Collectors.toList());
        result.setData(videoCategories);

        return result;
    }

    @ApiOperation(value = "video catogry 더하기", notes = "<pre> video cateogry add")
    @RequestMapping(value = "/category/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseBase addCategory(@RequestBody VideoCategory videoCategory) {
        ResponseBase<VideoCategory> result = new SimpleResponse<>();
        result.setData(videoService.addCategory(videoCategory));
        return result;
    }

    @ApiOperation(value = "video link 더하기", notes = "<pre> video link add")
    @RequestMapping(value = "/link/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseBase addVideoLink(@RequestBody VideoContent videoContent) {
        ResponseBase<VideoContent> result = new SimpleResponse<>();
        result.setData(videoService.addVideoLink(videoContent));
        return result;
    }

    @ApiOperation(value = "video link list 조회 find first one", notes = "<pre> video list link get find one")
    @RequestMapping(value = "/link/{idx}", method = RequestMethod.GET)
    public ResponseBase getVideoLink(@ApiParam(required = true, name = "idx", value = "video category id")
                                         @PathVariable Long idx) {
        ResponseBase<VideoContent> result = new SimpleResponse<>();
        result.setData(videoService.getVideoLink(idx));
        return result;
    }
}
