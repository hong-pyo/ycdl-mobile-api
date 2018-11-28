package com.hong.controller;

import com.hong.common.ResponseBase;
import com.hong.domain.Board;
import com.hong.domain.SimpleResponse;
import com.hong.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by hong2 on 27/11/2018
 * Time : 11:07 PM
 */

@RestController
@RequestMapping("api/board")
public class BoardRestController {

    @Autowired
    private BoardService boardService;

    @RequestMapping("/all")
    @ResponseBody
    public ResponseBase getBoard() {
        ResponseBase<List<Board>> root = new SimpleResponse<>();
        List<Board> boardList = boardService.getBoards();
        root.setData(boardList);

        return root;
    }
}
