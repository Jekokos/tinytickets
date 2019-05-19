package org.tickets.tinyTickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tickets.tinyTickets.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
