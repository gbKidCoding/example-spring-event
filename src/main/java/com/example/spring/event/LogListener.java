package com.example.spring.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Queue;

@Slf4j
@Component
public class LogListener implements ApplicationListener<LogEvent> {

    public static Queue<String> queue = new LinkedList<>();

    @Override
    public void onApplicationEvent(LogEvent logEvent) {
        log.info("LogListener: {} ", logEvent.getLog());
        // you can save db
        queue.add(logEvent.getLog());
    }
}
