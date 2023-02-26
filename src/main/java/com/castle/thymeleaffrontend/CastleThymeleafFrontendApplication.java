package com.castle.thymeleaffrontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.castle")
public class CastleThymeleafFrontendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CastleThymeleafFrontendApplication.class, args);
    }

}
