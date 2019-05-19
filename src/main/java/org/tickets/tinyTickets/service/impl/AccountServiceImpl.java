package org.tickets.tinyTickets.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tickets.tinyTickets.entity.Account;
import org.tickets.tinyTickets.repository.AccountRepository;
import org.tickets.tinyTickets.service.AccountService;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account addAccount(Account account) { return accountRepository.saveAndFlush(account); }

    @Override
    public void delete(long id) {
        accountRepository.deleteById(id);
    }

    @Override
    public Account getById(Long id) {
        Account account;
        Optional<Account> optionalAccount = accountRepository.findById(id);
        if(optionalAccount.isPresent()){
            account = optionalAccount.get();
        }
        else{
            account = new Account();
        }

        return account;
    }

    @Override
    public Account editAccount(Account account) { return accountRepository.save(account); }

    @Override
    public List<Account> getAll() {
        return accountRepository.findAll();
    }
}
