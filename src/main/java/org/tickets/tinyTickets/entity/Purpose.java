package org.tickets.tinyTickets.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Purpose {
    private long idPurpose;
    private long idUser;
    private String doctor;
    private String text;

    @Id
    @Column(name = "id_purpose")
    public long getIdPurpose() {
        return idPurpose;
    }

    public void setIdPurpose(long idPurpose) {
        this.idPurpose = idPurpose;
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
    @Column(name = "doctor")
    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    @Basic
    @Column(name = "text")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purpose purpose = (Purpose) o;
        return idPurpose == purpose.idPurpose &&
                idUser == purpose.idUser &&
                Objects.equals(doctor, purpose.doctor) &&
                Objects.equals(text, purpose.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPurpose, idUser, doctor, text);
    }
}
