package com.test.mobilerecharge.events;

import org.springframework.context.ApplicationEvent;

import java.util.concurrent.atomic.AtomicInteger;

public class StatusPendingEvent extends ApplicationEvent {
    private String status;
    private AtomicInteger numberOfEvents;

    public StatusPendingEvent(Object source, String status) {
        super(source);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
