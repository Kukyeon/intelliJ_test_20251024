package com.kkuk.home.controller;


import com.kkuk.home.dto.Board;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/test")
    public String test(){
        return "hello world!!!!!";
    }

    @GetMapping("/board")
    public Board board(){

        Board board = new Board();
        board.setName("홍길동");
        board.setPass("123123");

        return board;
    }
}
