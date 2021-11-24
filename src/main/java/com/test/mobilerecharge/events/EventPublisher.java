package com.test.mobilerecharge.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EventPublisher {
    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void publishEvent(final String status){
        System.out.println("publishing event for " + status);
        StatusPendingEvent statusPendingEvent = new StatusPendingEvent(this, status);
        eventPublisher.publishEvent(statusPendingEvent);
    }
}
