package org.tickets.tinyTickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.tickets.tinyTickets.entity.Account;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    @Query("select a from Account a where a.login = :name")
    Optional<Account> findByName(@Param("name") String name);
}
