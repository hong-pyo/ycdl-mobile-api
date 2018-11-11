package com.hong.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hong.domain.Board;
import com.hong.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hong2 on 09/11/2018
 * Time : 12:13 AM
 */

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    BoardService boardService;

    @GetMapping({"", "/"})
    public String board(@RequestParam(value = "idx", defaultValue = "0") Long idx, Model model) {
        model.addAttribute("board", boardService.findBoardByIdx(idx));
        return "/board/form";
    }

    @GetMapping({"/list"})
    public String list(@PageableDefault Pageable pageable, Model model) {
        //return boardService.findBoardList(pageable).getContent();
        model.addAttribute("boardList", boardService.findBoardList(pageable));
        return "board/list";
    }
}
