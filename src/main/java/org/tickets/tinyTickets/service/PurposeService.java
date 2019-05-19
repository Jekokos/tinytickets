package org.tickets.tinyTickets.service;

import org.tickets.tinyTickets.entity.Purpose;

import java.util.List;

public interface PurposeService{
    Purpose addPurpose(Purpose purpose);
    void delete(long id);
    Purpose editPurpose(Purpose purpose);
    Purpose getById(Long id);
    List<Purpose> getAll();
}
