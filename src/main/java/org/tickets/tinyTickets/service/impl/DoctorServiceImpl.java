package org.tickets.tinyTickets.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tickets.tinyTickets.entity.Doctor;
import org.tickets.tinyTickets.repository.DoctorRepository;
import org.tickets.tinyTickets.service.DoctorService;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    @Override
    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.saveAndFlush(doctor);
    }

    @Override
    public void delete(long id) {
        doctorRepository.deleteById(id);
    }

    @Override
    public Doctor editDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public Doctor getById(Long id) {
        Doctor doctor;
        Optional<Doctor> optionalAccount = doctorRepository.findById(id);
        if(optionalAccount.isPresent()){
            doctor = optionalAccount.get();
        }
        else{
            doctor = new Doctor();
        }

        return doctor;
    }

    @Override
    public List<Doctor> getAll() {
        return doctorRepository.findAll();
    }
}
