/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.tads.as.DomainModel;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Maike Jordan
 */
@Entity
public class RegistroPonto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long registropontoid;
    
    @OneToOne
    private Funcionario funcionario;
    
    @Temporal(TemporalType.DATE)
    private Date entrada;

    @Temporal(TemporalType.DATE)
    private Date saida;
    
    
    
    public Long getRegistropontoid() {
        return registropontoid;
    }

    public void setRegistropontoid(Long id) {
        this.registropontoid = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (registropontoid != null ? registropontoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistroPonto)) {
            return false;
        }
        RegistroPonto other = (RegistroPonto) object;
        if ((this.registropontoid == null && other.registropontoid != null) || (this.registropontoid != null && !this.registropontoid.equals(other.registropontoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifnmg.tads.as.DomainModel.RegistroPonto[ id=" + registropontoid + " ]";
    }
    
}
