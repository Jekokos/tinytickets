package org.tickets.tinyTickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tickets.tinyTickets.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
