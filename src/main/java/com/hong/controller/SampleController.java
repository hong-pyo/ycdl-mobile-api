package com.hong.controller;

import com.hong.domain.Board;
import com.hong.service.BoardService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hong2 on 11/11/2018
 * Time : 11:54 PM
 */

@Api(description = "샘플 관련")
@RestController
public class SampleController {

    @Autowired
    private BoardService boardService;

    @ApiOperation(value = "샘플조회", notes = "<pre>샘플 정보를 조회하여 응답")
    @RequestMapping(value = "/board/{idx}", method = RequestMethod.GET)
    public Board getBoard(@ApiParam(required = true, name = "idx", value = "board 의 id")
                          @PathVariable Long idx) throws Exception {
        return boardService.findBoardByIdx(idx);
    }
}
