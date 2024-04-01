package com.example.oopworld.theater.domain;

import lombok.Value;

@Value
public class Theater {

    TicketSeller ticketSeller;

    public void enter(Audience audience) {
        ticketSeller.check(audience); // 관심사 분리.
    }

}
