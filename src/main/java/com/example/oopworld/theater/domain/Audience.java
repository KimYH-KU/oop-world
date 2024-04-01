package com.example.oopworld.theater.domain;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.math.BigDecimal;

@Value
@AllArgsConstructor
public class Audience {

    Bag bag;

    public boolean showInvitation(){
        return this.bag.hasInvitation();
    }

    public void receiveTicket(Ticket ticket){
        this.bag.setTicket(ticket);
    }

    public void giveFee(BigDecimal fee){
        this.bag.minusAmount(fee);
    }

    public void useInvitation(){
        this.bag.setInvitation(null);
    }

}
