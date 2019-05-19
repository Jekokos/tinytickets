package org.tickets.tinyTickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tickets.tinyTickets.entity.Purpose;

public interface PurposeRepository extends JpaRepository<Purpose, Long> {
}
