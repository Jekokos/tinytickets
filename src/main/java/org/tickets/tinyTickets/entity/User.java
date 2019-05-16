package org.tickets.tinyTickets.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class User {
    private long idUser;
    private long idAccount;
    private String lName;
    private String fName;
    private String mName;
    private long idAccess;

    @Id
    @Column(name = "id_user")
    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "id_account")
    public long getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(long idAccount) {
        this.idAccount = idAccount;
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
    @Column(name = "id_access")
    public long getIdAccess() {
        return idAccess;
    }

    public void setIdAccess(long idAccess) {
        this.idAccess = idAccess;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return idUser == user.idUser &&
                idAccount == user.idAccount &&
                idAccess == user.idAccess &&
                Objects.equals(lName, user.lName) &&
                Objects.equals(fName, user.fName) &&
                Objects.equals(mName, user.mName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, idAccount, lName, fName, mName, idAccess);
    }
}
