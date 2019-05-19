package org.tickets.tinyTickets.service;

import org.tickets.tinyTickets.entity.Question;

import java.util.List;

public interface QuestionService {
    Question addQuestion(Question question);
    void delete(long id);
    Question editQuestion(Question question);
    Question getById(Long id);
    List<Question> getAll();
}
