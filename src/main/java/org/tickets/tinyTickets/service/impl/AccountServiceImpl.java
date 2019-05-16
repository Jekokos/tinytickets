package org.tickets.tinyTickets.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tickets.tinyTickets.entity.Account;
import org.tickets.tinyTickets.repository.AccountRepository;
import org.tickets.tinyTickets.service.AccountService;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account addAccount(Account account) {
        return accountRepository.saveAndFlush(account);
    }

    @Override
    public void delete(long id) {
        accountRepository.deleteById(id);
    }

    @Override
    public Account getByName(String name) {
        return accountRepository.findByName(name);
    }

    @Override
    public Account editAccount(Account account) {
        return accountRepository.saveAndFlush(account);
    }

    @Override
    public List<Account> getAll() {
        return accountRepository.findAll();
    }
}
