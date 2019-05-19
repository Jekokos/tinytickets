package org.tickets.tinyTickets.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tickets.tinyTickets.entity.Question;
import org.tickets.tinyTickets.repository.QuestionRepository;
import org.tickets.tinyTickets.service.QuestionService;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    @Override
    public Question addQuestion(Question question) {
        return questionRepository.saveAndFlush(question);
    }

    @Override
    public void delete(long id) {
        questionRepository.deleteById(id);
    }

    @Override
    public Question editQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public Question getById(Long id) {
        Question question;
        Optional<Question> optionalAccount = questionRepository.findById(id);
        if(optionalAccount.isPresent()){
            question = optionalAccount.get();
        }
        else{
            question = new Question();
        }

        return question;
    }

    @Override
    public List<Question> getAll() {
        return questionRepository.findAll();
    }
}
