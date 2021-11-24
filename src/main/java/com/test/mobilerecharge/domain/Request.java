package com.test.mobilerecharge.domain;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Request {
    private String txnId;
}
