package com.test.mobilerecharge.application.port.in;

import com.test.mobilerecharge.domain.MobileRecharge;
import com.test.mobilerecharge.domain.Request;
import org.springframework.stereotype.Component;

@Component
public interface ServiceUseCase {
    public MobileRecharge makeRequest(Request request);
}
