package org.tickets.tinyTickets.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Doctor {
    private long idDoctor;
    private long idUser;
    private long idSpecialization;

    @Id
    @Column(name = "id_doctor")
    public long getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(long idDoctor) {
        this.idDoctor = idDoctor;
    }

    @Basic
    @Column(name = "id_user")
    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "id_specialization")
    public long getIdSpecialization() {
        return idSpecialization;
    }

    public void setIdSpecialization(long idSpecialization) {
        this.idSpecialization = idSpecialization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return idDoctor == doctor.idDoctor &&
                idUser == doctor.idUser &&
                idSpecialization == doctor.idSpecialization;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDoctor, idUser, idSpecialization);
    }
}
