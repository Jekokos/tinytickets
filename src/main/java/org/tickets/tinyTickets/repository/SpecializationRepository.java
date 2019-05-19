package org.tickets.tinyTickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tickets.tinyTickets.entity.Specialization;

public interface SpecializationRepository extends JpaRepository<Specialization, Long> {
}
