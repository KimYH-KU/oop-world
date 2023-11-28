package com.example.oopworld.theater.domain;

import lombok.Value;

@Value
public class Theater {

    TicketSeller ticketSeller;

    public void enter(Audience audience) {
        if (audience.getBag().hasInvitation()) {
            Ticket ticket = this.ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        } else {
            Ticket ticket = this.ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }

}
