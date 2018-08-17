package com.example.spring.event;


import org.springframework.context.ApplicationEvent;

public class LogEvent extends ApplicationEvent {

    private String log;

    public LogEvent(Object source, String log) {
        super(source);
        this.log = log;
    }

    public String getLog() {
        return log;
    }
}
