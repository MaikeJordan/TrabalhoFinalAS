/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.as.Presentation;

import br.edu.ifnmg.tads.as.DomainModel.Funcionario;
import br.edu.ifnmg.tads.as.Infraestrutura.FuncionarioDAO;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author Maike Jordan
 */
@Named(value = "pessoaController")
@SessionScoped
public class FuncionarioController implements Serializable {

    /**
     * Creates a new instance of FuncionarioController
     */
    @EJB
    FuncionarioDAO dao;
    private Funcionario entidade, filtro;
    private List<Funcionario> listagem;

    public FuncionarioController() {
        entidade = new Funcionario();
        filtro = new Funcionario();
    }

    public FuncionarioDAO getDao() {
        return dao;
    }

    public void setDao(FuncionarioDAO dao) {
        this.dao = dao;
    }

    public Funcionario getEntidade() {
        return entidade;
    }

    public void setEntidade(Funcionario entidade) {
        this.entidade = entidade;
    }

    public Funcionario getFiltro() {
        return filtro;
    }

    public void setFiltro(Funcionario filtro) {
        this.filtro = filtro;
    }

    public List<Funcionario> getListagem() {
        if(listagem == null){
            listagem = dao.Buscar(null);
        }
        return listagem;
    }

    public void setListagem(List<Funcionario> listagem) {
        this.listagem = listagem;
    }

    public void exibirMensagem(String msg) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(msg));
    }
    
    public void salvar() {
        if (dao.Salvar(entidade)) {
            exibirMensagem("Salvo com sucesso!");
            entidade = new Funcionario();
        } else {
            exibirMensagem("Falha!");
        }
    }
    
    public void filtrar(){
        listagem = dao.Buscar(filtro);
    }

    public String novo(){
        entidade = new Funcionario();
        return "CadastroFuncionario.xhtml";
    }
    
}
