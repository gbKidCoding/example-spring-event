package com.example.spring.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringEventApplication {

    @Autowired
    private ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication.run(SpringEventApplication.class, args);
    }

    @GetMapping("/")
    public String publishLogTest() {
        applicationContext.publishEvent(new LogEvent(this, "publish Log Test It's work!"));
        return LogListener.queue.poll();
    }
}
