package com.myuuutime;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class MyuuutimeApplication extends SpringBootServletInitializer {

//    public static void main(String[] args) {
//        SpringApplication.run(MyuuutimeApplication.class, args);
//    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MyuuutimeApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MyuuutimeApplication.class, args);
    }

}
