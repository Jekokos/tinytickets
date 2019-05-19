package org.tickets.tinyTickets.service;

import org.tickets.tinyTickets.entity.Specialization;

import java.util.List;

public interface SpecializationService {
    Specialization addSpecialization(Specialization specialization);
    void delete(long id);
    Specialization editSpecialization(Specialization specialization);
    Specialization getById(Long id);
    List<Specialization> getAll();
}
