package org.tickets.tinyTickets.service;

import org.tickets.tinyTickets.entity.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    Account addAccount(Account account);
    void delete(long id);
    Account getById(Long id);
    Account editAccount(Account account);
    List<Account> getAll();
}
