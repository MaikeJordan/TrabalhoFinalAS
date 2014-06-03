/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.tads.as.DomainModel;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Maike Jordan
 */
@Entity
public class Cargo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cargoid;
    
    @Column(name="nome", length = 255)
    private String nome;
    
    @Column(name="salario")
    private Double salario;
    
    @OneToMany
    private List<Permissao> permissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public List<Permissao> getPermissao() {
        return permissao;
    }

    public void setPermissao(List<Permissao> permissao) {
        this.permissao = permissao;
    }
    
    public Long getCargoid() {
        return cargoid;
    }

    public void setCargoid(Long cargoid) {
        this.cargoid = cargoid;
    }

    public void addPermissao(Permissao p){
        if(!permissao.contains(p)){
            permissao.add(p);
        }
    }
    
    public void removePermissao(Permissao p){
        if(permissao.contains(p)){
            permissao.remove(p);
        }
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cargoid != null ? cargoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cargo)) {
            return false;
        }
        Cargo other = (Cargo) object;
        if ((this.cargoid == null && other.cargoid != null) || (this.cargoid != null && !this.cargoid.equals(other.cargoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifnmg.tads.as.DomainModel.Cargo[ id=" + cargoid + " ]";
    }
    
}
