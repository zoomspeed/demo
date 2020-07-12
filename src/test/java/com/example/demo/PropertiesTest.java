package com.example.demo;

import com.example.demo.controller.BoardController;
import com.example.demo.dto.BoardVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.core.env.Environment;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= BoardController.class,
                properties = {"author.name=Gurum",
                              "author.age=45",
                              "author.nation=Korea"})
public class PropertiesTest {
    @Autowired
    Environment environment;

    @Test
    public void testMethod(){
        System.out.println("이름 : " + environment.getProperty("author.name"));
        System.out.println("나이 : " + environment.getProperty("author.age"));
        System.out.println("국가 : " + environment.getProperty("author.nation"));
    }
}
