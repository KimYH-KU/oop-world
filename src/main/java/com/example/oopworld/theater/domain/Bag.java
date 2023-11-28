package com.example.oopworld.theater.domain;

import lombok.Setter;
import lombok.Value;
import lombok.experimental.NonFinal;

import java.math.BigDecimal;

@Value
public class Bag {

    @NonFinal
    BigDecimal amount;

    @Setter
    @NonFinal
    Ticket ticket;

    Invitation invitation;

    public boolean hasInvitation() {
        return invitation != null;
    }

    public void minusAmount(BigDecimal fee) {
        this.amount = this.amount.subtract(fee);
    }
}
