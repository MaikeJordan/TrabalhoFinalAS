/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.tads.as.Presentation;

import br.edu.ifnmg.tads.as.DomainModel.Pessoa;
import br.edu.ifnmg.tads.as.DomainModel.IPessoaRepositorio;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

/**
 *
 * @author Maike Jordan
 */

@Named(value = "pessoaConverter")
@SessionScoped
public class PessoaConverter implements Serializable, Converter{
    
    @EJB
    IPessoaRepositorio daoPessoa;
        
    public PessoaConverter(){
        
    }
    
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value == null || value.trim().equals("")) {
            return null;
        } else {
            Long id = Long.parseLong(value);
            return daoPessoa.Abrir(id);
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
      if (value == null || value.toString().equals("")){
          return "";
      } else{
          Pessoa p = (Pessoa)value;
          return p.getId().toString();
      }
    }
    
}
