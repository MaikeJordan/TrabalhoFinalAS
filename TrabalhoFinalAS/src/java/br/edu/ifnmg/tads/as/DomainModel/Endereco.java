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
public class Endereco implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long enderecoid;

    @Column(name = "rua", length = 255)
    private String rua;
    
    @Column(name = "numero", length = 11)
    private int numero;
    
    @Column(name = "complemento", length = 255)
    private String complemento;
    
    @Column(name = "bairro", length = 255)
    private String bairro;
    
    @Column(name = "cidade", length = 255)
    private String cidade;
    
    @Column(name = "cep", length = 9)
    private String cep;
    
    @Column(name = "estado", length = 255)
    private String estado;
    
    @Column(name = "pais", length = 255)
    private String pais;

    public Endereco(String rua, int numero, String complemento, String bairro, String cidade, String cep, String estado, String pais) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.estado = estado;
        this.pais = pais;
    }
    
    public Endereco() {
        this.rua = "";
        this.numero = 0;
        this.complemento = "";
        this.bairro = "";
        this.cidade = "";
        this.cep = "";
        this.estado = "";
        this.pais = "";
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
    public Long getEnderecoid() {
        return enderecoid;
    }

    public void setEnderecoid(Long enderecoid) {
        this.enderecoid = enderecoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (enderecoid != null ? enderecoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Endereco)) {
            return false;
        }
        Endereco other = (Endereco) object;
        if ((this.enderecoid == null && other.enderecoid != null) || (this.enderecoid != null && !this.enderecoid.equals(other.enderecoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifnmg.tads.as.DomainModel.Endereco[ id=" + enderecoid + " ]";
    }
    
}
