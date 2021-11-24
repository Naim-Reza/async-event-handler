package com.test.mobilerecharge.adapter.in.web;

import com.test.mobilerecharge.application.port.in.ServiceUseCase;
import com.test.mobilerecharge.domain.MobileRecharge;
import com.test.mobilerecharge.domain.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test-reactive")
public class WebController {
    @Autowired
    ServiceUseCase useCase;

    @GetMapping("/")
    MobileRecharge makecall(){
        return useCase.makeRequest(Request.builder().txnId("sdfaf").build());
    }

}
