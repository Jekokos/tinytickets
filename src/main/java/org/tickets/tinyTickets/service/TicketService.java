package org.tickets.tinyTickets.service;

import org.tickets.tinyTickets.entity.Ticket;

import java.util.List;

public interface TicketService {
    Ticket addTicket(Ticket ticket);
    void delete(long id);
    Ticket editTicket(Ticket ticket);
    Ticket getById(Long id);
    List<Ticket> getAll();
}
