package org.tickets.tinyTickets.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
public class Controller {

    @RequestMapping("/")
    public ModelAndView homePage(@RequestParam(name = "text", required = false, defaultValue = "SOME TEXT") String name,
                                 Map<String, Object> model){
        model.put("text", name);
        return new ModelAndView("index", model);
    }
}
