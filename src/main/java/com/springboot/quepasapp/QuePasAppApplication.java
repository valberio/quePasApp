package com.springboot.quepasapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
        "com.springboot.quepasapp"})
public class QuePasAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuePasAppApplication.class, args);
    }

}
