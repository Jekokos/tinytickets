package org.tickets.tinyTickets.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tickets.tinyTickets.entity.Ticket;
import org.tickets.tinyTickets.repository.TicketRepository;
import org.tickets.tinyTickets.service.TicketService;

import java.util.List;
import java.util.Optional;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    TicketRepository ticketRepository;

    @Override
    public Ticket addTicket(Ticket ticket) {
        return ticketRepository.saveAndFlush(ticket);
    }

    @Override
    public void delete(long id) {
        ticketRepository.deleteById(id);
    }

    @Override
    public Ticket editTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public Ticket getById(Long id) {
        Ticket ticket;
        Optional<Ticket> optionalAccount = ticketRepository.findById(id);
        if(optionalAccount.isPresent()){
            ticket = optionalAccount.get();
        }
        else{
            ticket = new Ticket();
        }

        return ticket;
    }

    @Override
    public List<Ticket> getAll() {
        return ticketRepository.findAll();
    }
}
