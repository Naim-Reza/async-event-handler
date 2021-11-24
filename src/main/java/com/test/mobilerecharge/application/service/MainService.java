package com.test.mobilerecharge.application.service;

import com.test.mobilerecharge.application.port.in.ServiceUseCase;
import com.test.mobilerecharge.domain.MobileRecharge;
import com.test.mobilerecharge.domain.Request;
import com.test.mobilerecharge.events.EventPublisher;
import com.test.mobilerecharge.events.StatusPendingEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService implements ServiceUseCase {
    @Autowired
    private EventPublisher eventPublisher;

    @Override
    public MobileRecharge makeRequest(Request request) {
        System.out.println(":::::::::::::Thread::::::::" + Thread.currentThread().getId() );
        MobileRecharge recharge = MobileRecharge.builder()
                .mobileNo("12555")
                .remarks("re")
                .amount(100)
                .status("pending")
                .reference("ref")
                .build();
        if (recharge.getStatus().equals("pending")){
            eventPublisher.publishEvent(recharge.getStatus());
            eventPublisher.publishEvent("Not pending");
        }
        System.out.println(":::::::::::::Thread::::::::" + Thread.currentThread().getId() );
        return recharge;
    }
}
