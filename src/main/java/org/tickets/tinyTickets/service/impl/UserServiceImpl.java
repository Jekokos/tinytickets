package org.tickets.tinyTickets.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tickets.tinyTickets.entity.User;
import org.tickets.tinyTickets.repository.UserRepository;
import org.tickets.tinyTickets.service.UserService;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public void delete(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User editUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getById(Long id) {
        User user;
        Optional<User> optionalAccount = userRepository.findById(id);
        if(optionalAccount.isPresent()){
            user = optionalAccount.get();
        }
        else{
            user = new User();
        }

        return user;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
