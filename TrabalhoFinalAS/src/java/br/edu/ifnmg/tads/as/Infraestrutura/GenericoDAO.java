/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.as.Infraestrutura;

import br.edu.ifnmg.tads.as.DomainModel.RepositorioGenerico;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Maike Jordan
 * @param <T>
 */
public abstract class GenericoDAO<T> implements RepositorioGenerico<T> {

    @PersistenceContext(name = "GestaoPatrimonialPU")
    protected EntityManager manager;
    private Class tipo;

    public GenericoDAO(Class t) {
        tipo = t;
    }

    @Override
    public boolean Salvar(T obj) {
        try {
            //salva o objeto
            manager.merge(obj);
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    @Override
    public T Abrir(Long id) {
        try {
            T obj = (T) manager.find(tipo, id);
            return obj;
            //abrir
        } catch (Exception ex) {
            return null;
        }
    }

    public abstract List<T> Buscar(T obj);

    @Override
    public boolean Apagar(T obj) {
        try {
            manager.remove(manager.merge(obj));
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
