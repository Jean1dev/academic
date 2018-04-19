/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanGerenciador;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author jeanfernandes
 */
@Named(value = "gerenciadorPages")
@Dependent
public class GerenciadorPages {

    public String goToLogin(){
        return "index";
    }
    /**
     * Creates a new instance of GerenciadorPages
     */
    public GerenciadorPages() {
    }
    
}
