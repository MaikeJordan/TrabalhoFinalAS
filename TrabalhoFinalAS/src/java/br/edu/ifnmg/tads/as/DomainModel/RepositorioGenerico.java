/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.tads.as.DomainModel;

/**
 *
 * @author ALUNO-2014-01
 * @param <T>
 */

public interface RepositorioGenerico<T> {
    
    public boolean Salvar(T obj);
    public T Abrir(Long id);
    public boolean Apagar(T obj);
    
}
