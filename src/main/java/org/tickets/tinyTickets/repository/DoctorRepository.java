package org.tickets.tinyTickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tickets.tinyTickets.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
