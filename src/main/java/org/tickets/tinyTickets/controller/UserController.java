package org.tickets.tinyTickets.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tickets.tinyTickets.entity.User;
import org.tickets.tinyTickets.service.impl.UserServiceImpl;

import java.util.Collection;

@RestController
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public Collection<User> allUsers(){

        return userService.getAll();
    }

    @RequestMapping(value = "user/{id}", method = RequestMethod.GET)
    public User getById(@PathVariable Long id){
        return userService.getById(id);
    }
}
