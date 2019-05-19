package org.tickets.tinyTickets.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tickets.tinyTickets.entity.Access;
import org.tickets.tinyTickets.repository.AccessRepository;
import org.tickets.tinyTickets.service.AccessService;

import java.util.List;
import java.util.Optional;

@Service
public class AccessServiceImpl implements AccessService {

    @Autowired
    private AccessRepository accessRepository;

    @Override
    public Access addAccess(Access access){ return accessRepository.saveAndFlush(access); }

    @Override
    public void delete(long id) { accessRepository.deleteById(id); }

    @Override
    public Access editAccess(Access access) { return accessRepository.save(access); }

    @Override
    public Access getById(Long id) {
        Access account;
        Optional<Access> optionalAccount = accessRepository.findById(id);
        if(optionalAccount.isPresent()){
            account = optionalAccount.get();
        }
        else{
            account = new Access();
        }

        return account;
    }

    @Override
    public List<Access> getAll() {
        return accessRepository.findAll();
    }
}
