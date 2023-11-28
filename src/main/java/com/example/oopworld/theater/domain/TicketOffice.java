package com.example.oopworld.theater.domain;

import lombok.Value;
import lombok.experimental.NonFinal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Value
public class TicketOffice {

    List<Ticket> tickets = new ArrayList<>();

    @NonFinal
    BigDecimal amount;

    public Ticket getTicket() {
        return this.tickets.remove(0);
    }

    public void plusAmount(BigDecimal fee) {
        this.amount = this.amount.add(fee);
    }
}
