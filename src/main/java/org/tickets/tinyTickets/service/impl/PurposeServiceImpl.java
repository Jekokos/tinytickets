package org.tickets.tinyTickets.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tickets.tinyTickets.entity.Purpose;
import org.tickets.tinyTickets.repository.PurposeRepository;
import org.tickets.tinyTickets.service.PurposeService;

import java.util.List;
import java.util.Optional;

@Service
public class PurposeServiceImpl implements PurposeService {
    @Autowired
    PurposeRepository purposeRepository;


    @Override
    public Purpose addPurpose(Purpose purpose) {
        return purposeRepository.saveAndFlush(purpose);
    }

    @Override
    public void delete(long id) {
        purposeRepository.deleteById(id);
    }

    @Override
    public Purpose editPurpose(Purpose purpose) {
        return purposeRepository.save(purpose);
    }

    @Override
    public Purpose getById(Long id) {
        Purpose purpose;
        Optional<Purpose> optionalAccount = purposeRepository.findById(id);
        if(optionalAccount.isPresent()){
            purpose = optionalAccount.get();
        }
        else{
            purpose = new Purpose();
        }

        return purpose;
    }

    @Override
    public List<Purpose> getAll() {
        return purposeRepository.findAll();
    }
}
