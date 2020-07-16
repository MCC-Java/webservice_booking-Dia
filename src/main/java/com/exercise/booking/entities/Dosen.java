/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercise.booking.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yosef
 */
@Entity
@Table(name = "dosen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dosen.findAll", query = "SELECT d FROM Dosen d")
    , @NamedQuery(name = "Dosen.findByNik", query = "SELECT d FROM Dosen d WHERE d.nik = :nik")
    , @NamedQuery(name = "Dosen.findByName", query = "SELECT d FROM Dosen d WHERE d.name = :name")
    , @NamedQuery(name = "Dosen.findByEmail", query = "SELECT d FROM Dosen d WHERE d.email = :email")
    , @NamedQuery(name = "Dosen.findByPhone", query = "SELECT d FROM Dosen d WHERE d.phone = :phone")
    , @NamedQuery(name = "Dosen.findByAddress", query = "SELECT d FROM Dosen d WHERE d.address = :address")})
public class Dosen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nik")
    private Integer nik;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private Integer phone;
    @Column(name = "address")
    private String address;

    public Dosen() {
    }

    public Dosen(Integer nik) {
        this.nik = nik;
    }

    public Integer getNik() {
        return nik;
    }

    public void setNik(Integer nik) {
        this.nik = nik;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nik != null ? nik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dosen)) {
            return false;
        }
        Dosen other = (Dosen) object;
        if ((this.nik == null && other.nik != null) || (this.nik != null && !this.nik.equals(other.nik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.exercise.booking.entities.Dosen[ nik=" + nik + " ]";
    }
    
}
