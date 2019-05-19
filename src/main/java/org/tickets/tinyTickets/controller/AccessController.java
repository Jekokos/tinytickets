package org.tickets.tinyTickets.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tickets.tinyTickets.entity.Access;
import org.tickets.tinyTickets.service.impl.AccessServiceImpl;

import java.util.Collection;

@RestController
public class AccessController {
    @Autowired
    private AccessServiceImpl accessService;

    @RequestMapping(value = "/access", method = RequestMethod.GET)
    public Collection<Access> allAccess(){
        return accessService.getAll();
    }

    @RequestMapping(value = "access/{id}", method = RequestMethod.GET)
    public Access getById(@PathVariable Long id){
        return accessService.getById(id);
    }

}
