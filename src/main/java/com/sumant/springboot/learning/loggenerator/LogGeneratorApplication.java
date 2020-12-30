package com.sumant.springboot.learning.loggenerator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LogGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogGeneratorApplication.class, args);
    }

}
