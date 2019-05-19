package org.tickets.tinyTickets.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tickets.tinyTickets.entity.Specialization;
import org.tickets.tinyTickets.repository.SpecializationRepository;
import org.tickets.tinyTickets.service.SpecializationService;

import java.util.List;
import java.util.Optional;

@Service
public class SpecializationServiceImpl implements SpecializationService {

    @Autowired
    SpecializationRepository specializationRepository;

    @Override
    public Specialization addSpecialization(Specialization specialization) {
        return specializationRepository.saveAndFlush(specialization);
    }

    @Override
    public void delete(long id) {

        specializationRepository.deleteById(id);
    }

    @Override
    public Specialization editSpecialization(Specialization specialization) {
        return specializationRepository.save(specialization);
    }

    @Override
    public Specialization getById(Long id) {
        Specialization specialization;
        Optional<Specialization> optionalAccount = specializationRepository.findById(id);
        if(optionalAccount.isPresent()){
            specialization = optionalAccount.get();
        }
        else{
            specialization = new Specialization();
        }

        return specialization;
    }

    @Override
    public List<Specialization> getAll() {

        return specializationRepository.findAll();
    }
}
