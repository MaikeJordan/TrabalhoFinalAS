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
public class RegistroAtividade implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long registroatividadeid;
    
    @Temporal(TemporalType.DATE)
    private Date entrada;

    @Temporal(TemporalType.DATE)
    private Date saida;
    
    private Boolean status;
    
    @OneToOne
    private Departamento departamento;
    
    @OneToOne
    private Funcionario funcionario;

    public RegistroAtividade(Long registroatividadeid, Date inicio, Date fim, Boolean status, Departamento departamento, Funcionario funcionario) {
        this.registroatividadeid = registroatividadeid;
        this.entrada = inicio;
        this.saida = fim;
        this.status = status;
        this.departamento = departamento;
        this.funcionario = funcionario;
    }

    public RegistroAtividade() {
        this.registroatividadeid = null;
        this.entrada = null;
        this.saida = null;
        this.status = null;
        this.departamento = null;
        this.funcionario = null;
    }
    
    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }

    public Boolean isStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    public Long getRegistroatividadeid() {
        return registroatividadeid;
    }

    public void setRegistroatividadeid(Long registroatividadeid) {
        this.registroatividadeid = registroatividadeid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (registroatividadeid != null ? registroatividadeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistroAtividade)) {
            return false;
        }
        RegistroAtividade other = (RegistroAtividade) object;
        if ((this.registroatividadeid == null && other.registroatividadeid != null) || (this.registroatividadeid != null && !this.registroatividadeid.equals(other.registroatividadeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifnmg.tads.as.DomainModel.RegistroAtividade[ id=" + registroatividadeid + " ]";
    }
    
}
