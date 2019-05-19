package org.tickets.tinyTickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.tickets.tinyTickets.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
    //Пример создания своего запроса
    /*@Query("select a from Account a where a.login = :name")
    Account findByName(@Param("name") String name);/*/
}
