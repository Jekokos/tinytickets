package org.tickets.tinyTickets.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Access {
    private long idAccess;
    private String name;

    @Id
    @Column(name = "id_access")
    public long getIdAccess() {
        return idAccess;
    }

    public void setIdAccess(long idAccess) {
        this.idAccess = idAccess;
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
        Access access = (Access) o;
        return idAccess == access.idAccess &&
                Objects.equals(name, access.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAccess, name);
    }
}
