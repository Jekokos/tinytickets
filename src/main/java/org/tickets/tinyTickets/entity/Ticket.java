package org.tickets.tinyTickets.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Ticket {
    private long idTicket;
    private int numb;
    private String lName;
    private String fName;
    private String mName;
    private long idDoctor;
    private Date data;
    private Time time;

    @Id
    @Column(name = "id_ticket")
    public long getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(long idTicket) {
        this.idTicket = idTicket;
    }

    @Basic
    @Column(name = "numb")
    public int getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }

    @Basic
    @Column(name = "l_name")
    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Basic
    @Column(name = "f_name")
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    @Basic
    @Column(name = "m_name")
    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    @Basic
    @Column(name = "id_doctor")
    public long getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(long idDoctor) {
        this.idDoctor = idDoctor;
    }

    @Basic
    @Column(name = "data")
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Basic
    @Column(name = "time")
    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return idTicket == ticket.idTicket &&
                numb == ticket.numb &&
                idDoctor == ticket.idDoctor &&
                Objects.equals(lName, ticket.lName) &&
                Objects.equals(fName, ticket.fName) &&
                Objects.equals(mName, ticket.mName) &&
                Objects.equals(data, ticket.data) &&
                Objects.equals(time, ticket.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTicket, numb, lName, fName, mName, idDoctor, data, time);
    }
}
