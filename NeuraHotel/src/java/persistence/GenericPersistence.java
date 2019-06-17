/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import JPA.JPA;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author jeanfernandes
 */
public class GenericPersistence {

    EntityManager Entity = JPA.getEM();

    public void salvar() {
        try {
            EntityTransaction t = Entity.getTransaction();
            t.begin();
            Entity.merge(this);
            t.commit();
        } catch (Exception ex) {
        }
    }

    public void excluir() {
        try {
            EntityTransaction t = Entity.getTransaction();
            t.begin();
            Entity.remove(this);
            t.commit();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
