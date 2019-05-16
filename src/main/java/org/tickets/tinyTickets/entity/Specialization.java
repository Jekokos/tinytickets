package org.tickets.tinyTickets.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Specialization {
    private long idSpecialization;
    private String name;

    @Id
    @Column(name = "id_specialization")
    public long getIdSpecialization() {
        return idSpecialization;
    }

    public void setIdSpecialization(long idSpecialization) {
        this.idSpecialization = idSpecialization;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Specialization that = (Specialization) o;
        return idSpecialization == that.idSpecialization &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSpecialization, name);
    }
}
