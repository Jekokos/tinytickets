package org.tickets.tinyTickets.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.tickets.tinyTickets.entity.Question;
import org.tickets.tinyTickets.service.impl.QuestionServiceImpl;

import java.util.Collection;
import java.util.Map;

@RestController
public class QuestionController {
    @Autowired
    QuestionServiceImpl questionService;

    @RequestMapping(value = "/question", method = RequestMethod.GET)
    public ModelAndView allQuestions(Map<String, Object> model){
        Collection<Question> questions = questionService.getAll();
        model.put("questions", questions);
        return new ModelAndView("questions", model);
    }

    @RequestMapping(value = "question/{id}", method = RequestMethod.GET)
    public Question getById(@PathVariable Long id){
        return questionService.getById(id);
    }
}
