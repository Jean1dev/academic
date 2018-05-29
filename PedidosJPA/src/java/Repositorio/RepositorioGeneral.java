/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorio;

import aplicacao.JPA;
import javax.persistence.*;

/**
 *
 * @author jeanfernandes
 */
public class RepositorioGeneral {

    EntityManager Entity = JPA.getEM();
    
    public void salvar() {
        EntityTransaction t = Entity.getTransaction();
        t.begin();
        Entity.merge(this);
        t.commit();
    }

    public void excluir() {
        EntityTransaction t = Entity.getTransaction();
        t.begin();
        Entity.remove(this);
        t.commit();
    }
    
    public void selecionarRegistro(Integer codigo){
          Entity.find(this.getClass(), codigo);
    }
}
