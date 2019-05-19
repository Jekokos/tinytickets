package org.tickets.tinyTickets.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tickets.tinyTickets.entity.Purpose;
import org.tickets.tinyTickets.service.impl.PurposeServiceImpl;

import java.util.Collection;

@RestController
public class PurposeController {
    @Autowired
    private PurposeServiceImpl purposeService;

    @RequestMapping(value = "/purpose", method = RequestMethod.GET)
    public Collection<Purpose> allPurposes(){
        return purposeService.getAll();
    }

    @RequestMapping(value = "purpose/{id}", method = RequestMethod.GET)
    public Purpose getById(@PathVariable Long id){
        return purposeService.getById(id);
    }
}
