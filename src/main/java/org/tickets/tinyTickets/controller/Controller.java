package org.tickets.tinyTickets.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Controller {

    @RequestMapping("/")
    public String homePage(@RequestParam(name = "text", required = false, defaultValue = "SOME TEXT") String name,
                           Model model){
        model.addAttribute("text", name);
        return "index";
    }
}
