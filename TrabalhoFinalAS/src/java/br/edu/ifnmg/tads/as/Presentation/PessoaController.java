/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.tads.as.Presentation;

import br.edu.ifnmg.tads.as.DomainModel.Pessoa;
import br.edu.ifnmg.tads.as.DomainModel.IPessoaRepositorio;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author ALUNO-2014-01
 */
@Named(value = "pessoaController")
@SessionScoped
public class PessoaController implements Serializable {

    /**
     * Creates a new instance of PessoaController
     */
    
    Pessoa pessoa;
    
    @EJB
    IPessoaRepositorio dao;
    
    public PessoaController() {
        pessoa = new Pessoa();
    }
    
    public void exibirMensagem(String msg) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(msg));
    }
    
    public String Salvar(){
        dao.Salvar(pessoa);
        exibirMensagem("Sucesso");
        return "index.xhtml";
    }
}
