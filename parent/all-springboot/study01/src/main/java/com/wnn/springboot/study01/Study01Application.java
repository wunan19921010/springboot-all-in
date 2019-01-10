package com.wnn.springboot.study01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.SpringServletContainerInitializer;

@SpringBootApplication
public class Study01Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Study01Application.class, args);
    }


    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Study01Application.class);
    }
}

