package br.edu.ifnmg.tads.as.Infraestrutura;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.edu.ifnmg.tads.as.DomainModel.IPessoaRepositorio;
import br.edu.ifnmg.tads.as.DomainModel.Pessoa;
import br.edu.ifnmg.tads.as.Infraestrutura.GenericoDAO;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author Maike Jordan
 */
@Stateless
public class PessoaDAO extends GenericoDAO<Pessoa>{

    public PessoaDAO() {
        super(Pessoa.class);
    }

    @Override
    public List<Pessoa> Buscar(Pessoa obj) {
        String Consulta = "select l from Pessoa l";
        if (obj != null) {
            Consulta = Consulta + " where l.nome like '%" + obj.getNome() + "%'";
        }
        Query q = manager.createQuery(Consulta);
        return q.getResultList();
    }

}

