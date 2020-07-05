package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Diary {

    @Id

    private long id;
    private String user;
    private String title;
    private String content;
}
