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

    public void salvar() {
        EntityManager em = JPA.getEM();
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.merge(this);
        t.commit();
    }

    public void excluir() {
        EntityManager em = JPA.getEM();
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.remove(this);
        t.commit();
    }
    
    public void selecionarRegistro(Integer codigo){
          EntityManager em = JPA.getEM();
          em.find(this.getClass(), codigo);
    }
}
