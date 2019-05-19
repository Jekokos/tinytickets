package org.tickets.tinyTickets.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tickets.tinyTickets.entity.Doctor;
import org.tickets.tinyTickets.service.impl.DoctorServiceImpl;

import java.util.Collection;

@RestController
public class DoctorController {
    @Autowired
    DoctorServiceImpl doctorService;

    @RequestMapping(value = "/doctors", method = RequestMethod.GET)
    public Collection<Doctor> allDoctors(){
        return doctorService.getAll();
    }

    @RequestMapping(value = "doctors/{id}", method = RequestMethod.GET)
    public Doctor getById(@PathVariable Long id){
        return doctorService.getById(id);
    }
}
