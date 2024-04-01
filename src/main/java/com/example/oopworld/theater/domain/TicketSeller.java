package com.example.oopworld.theater.domain;

import lombok.Value;

@Value
public class TicketSeller {

    TicketOffice ticketOffice;

    public void check(Audience audience) {
        Ticket ticket = ticketOffice.getTicket();
        if (audience.showInvitation()) {
            audience.receiveTicket(ticket); // TicketSeller 쪽에 audience 관련 메소드가 있는게 맞는지 궁금
            audience.useInvitation();
        } else {
            audience.giveFee(ticket.getFee());
            ticketOffice.plusAmount(ticket.getFee());
            audience.receiveTicket(ticket);
        }
    }
}
