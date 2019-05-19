package org.tickets.tinyTickets.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tickets.tinyTickets.entity.Specialization;
import org.tickets.tinyTickets.service.impl.SpecializationServiceImpl;

import java.util.Collection;

@RestController
public class SpecializationController {
    @Autowired
    SpecializationServiceImpl specializationService;

    @RequestMapping(value = "/specialization", method = RequestMethod.GET)
    public Collection<Specialization> allSpecializations(){
        return specializationService.getAll();
    }

    @RequestMapping(value = "specialization/{id}", method = RequestMethod.GET)
    public Specialization getById(@PathVariable Long id){
        return specializationService.getById(id);
    }
}
