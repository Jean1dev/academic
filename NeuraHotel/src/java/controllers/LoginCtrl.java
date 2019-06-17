/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import models.Usuario;

/**
 *
 * @author jeanfernandes
 */
@Named(value = "loginCtrl")
@ManagedBean
@ViewScoped
public class LoginCtrl {
 
    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    private String testebean = "work";

    public String getTestebean() {
        return testebean;
    }

    public void setTestebean(String testebean) {
        this.testebean = testebean;
    }
  

    /**
     * Creates a new instance of LoginCtrl
     */
    public LoginCtrl() {
    }

}
