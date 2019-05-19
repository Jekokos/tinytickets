package org.tickets.tinyTickets.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Controller {

    @RequestMapping("/")
    public String homePage(Map<String, Object> model){
        //model.put("some", "By Yura Yarmoshuk");
        return "main";
    }
}
