package com.example.lunch;

import com.example.lunch.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.security.crypto.password.PasswordEncoder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Kurbanova Nigina
 */

@EnableScheduling
@EnableSwagger2
@SpringBootApplication
@RequiredArgsConstructor
public class LunchApplication {

    private final PasswordEncoder passwordEncoder;
    private final UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(LunchApplication.class, args);

    }

    @Scheduled(cron = "0 10 8-10 * * MON-FRI",zone = "Asia/Tashkent")
    public void scheduler() {
        System.out.println("Tushlikga buyurtma berasizmi?");
    }

}
