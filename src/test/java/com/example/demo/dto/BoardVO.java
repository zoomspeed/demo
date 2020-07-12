package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BoardVO {

    private int seq;
    private String title;
    private String writer;
    private String content;
    private Date createDate = new Date();
    private int cnt = 0;
}
