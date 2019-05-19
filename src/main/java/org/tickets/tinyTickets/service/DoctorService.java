package org.tickets.tinyTickets.service;

import org.tickets.tinyTickets.entity.Doctor;

import java.util.List;

public interface DoctorService {
    Doctor addDoctor(Doctor doctor);
    void delete(long id);
    Doctor editDoctor(Doctor doctor);
    Doctor getById(Long id);
    List<Doctor> getAll();
}
