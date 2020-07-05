package com.example.demo.controller;

import com.example.demo.dto.BoardVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class BoardController {

    public BoardController(){
        System.out.println("===> BoardController 생성");
    }

    @GetMapping("/hello")
    public String hello(String name){
        return "Hello : " + name;
    }

    @GetMapping("/getBoard")
    public BoardVO getBoard(){
        BoardVO board = new BoardVO();
        board.setSeq(1);
        board.setTitle("테스트 제목");
        board.setWriter("테스터");
        board.setContent("테스트 내용입니다.......");
        board.setCreateDate(new Date());
        board.setCnt(0);
        return board;
    }
}
