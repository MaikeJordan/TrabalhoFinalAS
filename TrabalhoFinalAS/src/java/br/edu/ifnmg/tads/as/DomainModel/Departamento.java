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
import javax.persistence.OneToOne;

/**
 *
 * @author Maike Jordan
 */
@Entity
public class Departamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departamentoid;
    
    @Column(name="nome", length = 255)
    private String nome;
    
    @OneToOne
    private Permissao permissao;

    public Departamento(Long departamentoid, String nome, Permissao permissao) {
        this.departamentoid = departamentoid;
        this.nome = nome;
        this.permissao = permissao;
    }

    public Departamento() {
        this.departamentoid = null;
        this.nome = "";
        this.permissao = null;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Permissao getPermissao() {
        return permissao;
    }

    public void setPermissao(Permissao permissao) {
        this.permissao = permissao;
    }
    
    public Long getDepartamentoid() {
        return departamentoid;
    }

    public void setDepartamentoid(Long departamentoid) {
        this.departamentoid = departamentoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (departamentoid != null ? departamentoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departamento)) {
            return false;
        }
        Departamento other = (Departamento) object;
        if ((this.departamentoid == null && other.departamentoid != null) || (this.departamentoid != null && !this.departamentoid.equals(other.departamentoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifnmg.tads.as.DomainModel.Departamento[ id=" + departamentoid + " ]";
    }
    
}
