package org.tickets.tinyTickets.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.tickets.tinyTickets.entity.Account;
import org.tickets.tinyTickets.service.impl.AccountServiceImpl;

import java.util.Collection;
import java.util.Map;

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

    @RequestMapping("/passwordAssistance")
    public ModelAndView passwordAssistancePage(Map<String, Object> model){
        return new ModelAndView("remindPass", model);
    }

    //получение текста вопроса по id
    @RequestMapping("/questionCheck")
    public ModelAndView questionCheckPage(@RequestParam String login, Map<String, Object> model){
        Account account = accountService.findByName(login);
        if(account.getIdAccount() != 0) {
            model.put("questionText", account.getIdQuestion().toString());
            return new ModelAndView("questionCheck", model);
        }
        return new ModelAndView("remindPass", model);
    }

    //получение имени пользователя по id
    @RequestMapping("/admin")
    public ModelAndView adminPage (@RequestParam String login, Map<String, Object> model){
        Account account = accountService.findByName(login);
        if (account.getIdAccount() != 0){
            model.put("name", "yura");
            return new ModelAndView("admin", model);
        }
        return new ModelAndView("index", model);
    }
}
