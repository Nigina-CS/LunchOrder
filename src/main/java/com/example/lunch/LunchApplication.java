package com.example.lunch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Kurbanova Nigina
 */

@EnableScheduling
@EnableSwagger2
@SpringBootApplication
public class LunchApplication {

    public static void main(String[] args) {
        SpringApplication.run(LunchApplication.class, args);

    }

    @Scheduled(cron = "0 10 8-10 * * MON-FRI")
    public void scheduler() {
        System.out.println("Tushlikga buyurtma berasizmi?");
    }

}
