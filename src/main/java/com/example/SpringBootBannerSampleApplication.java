package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBannerSampleApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringBootBannerSampleApplication.class);
        app.setBanner(new CustomBanner());
        app.run(args);
    }
}
