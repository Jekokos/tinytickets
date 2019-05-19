package org.tickets.tinyTickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tickets.tinyTickets.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
