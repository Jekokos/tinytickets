package org.tickets.tinyTickets.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.tickets.tinyTickets.entity.Account;
import org.tickets.tinyTickets.service.impl.AccountServiceImpl;

import java.util.Collection;

@RestController
public class AccountController {

    @Autowired
    private AccountServiceImpl accountService;

    @RequestMapping(value = "/accounts", method = RequestMethod.GET)
    public Collection<Account> allAccounts(){
        return accountService.getAll();
    }

    @RequestMapping(value = "accounts/{id}", method = RequestMethod.GET)
    public Account getById(@PathVariable Long id){
            return accountService.getById(id);
    }

    /*@RequestMapping(value = "/accounts/{name}", method = RequestMethod.GET)
    public Account byName(@PathVariable String name){
        return accountRepository.findByName(name);
    }*/
}
