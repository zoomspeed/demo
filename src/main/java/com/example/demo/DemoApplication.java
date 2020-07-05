package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.Banner;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        //SpringApplication app = new SpringApplication(DemoApplication.class);
        //app.setBannerMode(Banner.Mode.OFF);
        //app.run(DemoApplication.class, args);
        SpringApplication.run(DemoApplication.class, args);
    }

}
