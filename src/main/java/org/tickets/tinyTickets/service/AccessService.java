package org.tickets.tinyTickets.service;

import org.tickets.tinyTickets.entity.Access;

import java.util.List;

public interface AccessService {
    Access addAccess(Access access);
    void delete(long id);
    Access editAccess(Access access);
    Access getById(Long id);
    List<Access> getAll();
}
