/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.as.DomainModel;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Maike
 */
@Entity
public class Telefone implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long telefoneid;

    @Column(name = "ddd", length = 3)
    private int ddd;

    @Column(name = "numero", length = 8)
    private int numero;

    public Telefone(int ddd, int numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    public Telefone() {
        this.ddd = 0;
        this.numero = 0;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Long getTelefoneid() {
        return telefoneid;
    }

    public void setTelefoneid(Long telefoneid) {
        this.telefoneid = telefoneid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (telefoneid != null ? telefoneid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Telefone)) {
            return false;
        }
        Telefone other = (Telefone) object;
        if ((this.telefoneid == null && other.telefoneid != null) || (this.telefoneid != null && !this.telefoneid.equals(other.telefoneid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifnmg.tads.as.DomainModel.Telefone[ id=" + telefoneid + " ]";
    }

}
