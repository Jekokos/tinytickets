package org.tickets.tinyTickets.service;

import org.tickets.tinyTickets.entity.User;

import java.util.List;

public interface UserService {
    User addUser(User user);
    void delete(long id);
    User editUser(User user);
    User getById(Long id);
    List<User> getAll();
}
