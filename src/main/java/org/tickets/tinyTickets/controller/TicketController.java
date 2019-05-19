package org.tickets.tinyTickets.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tickets.tinyTickets.entity.Ticket;
import org.tickets.tinyTickets.service.impl.TicketServiceImpl;

import java.util.Collection;

@RestController
public class TicketController {

    @Autowired
    TicketServiceImpl ticketService;

    @RequestMapping(value = "/ticket", method = RequestMethod.GET)
    public Collection<Ticket> allTickets(){
        return ticketService.getAll();
    }

    @RequestMapping(value = "ticket/{id}", method = RequestMethod.GET)
    public Ticket getById(@PathVariable Long id){
        return ticketService.getById(id);
    }
}
