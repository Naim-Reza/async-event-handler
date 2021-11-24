package com.test.mobilerecharge.domain;


import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MobileRecharge {

    private String mobileNo;

    private  Integer amount;

    private  String reference;

    private  String remarks;

    private String status;



}
