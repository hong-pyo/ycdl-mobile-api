package com.hong.controller;

import com.hong.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hong2 on 12/03/2019
 * Time : 12:38 AM
 */

@Controller
@RequestMapping("/policy")
public class PolicyController {

    @Autowired
    BoardService boardService;

    @GetMapping({"/audio"})
    public String list(@PageableDefault Pageable pageable, Model model) {
        model.addAttribute("boardList", boardService.findBoardList(pageable));
        return "policy/audio";
    }
}
