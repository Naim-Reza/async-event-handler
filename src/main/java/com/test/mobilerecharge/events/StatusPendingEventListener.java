package com.test.mobilerecharge.events;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class StatusPendingEventListener implements ApplicationListener<StatusPendingEvent> {
    @Override
    public void onApplicationEvent(StatusPendingEvent event) {
        try {
            Thread.sleep(10000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Event caught: " + event.getStatus());
        System.out.println("::::::::::::Thread::::::::" + Thread.currentThread().getId());

    }
}
