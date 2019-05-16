package org.tickets.tinyTickets.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tickets.tinyTickets.entity.Account;
import org.tickets.tinyTickets.repository.AccountRepository;

import java.util.Collection;

@RestController
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @RequestMapping(value = "/accounts", method = RequestMethod.GET)
    public Collection<Account> allAcounts(){
        return accountRepository.findAll();
    }

    @RequestMapping(value = "/accounts/{name}", method = RequestMethod.GET)
    public Account byName(@PathVariable String name){
        return accountRepository.findByName(name);
    }
}
