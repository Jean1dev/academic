/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanGerenciador;

import Model.UsuarioModel;
import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author jeanfernandes
 */
//@Named(value = "usuarioController")
@ManagedBean
@Dependent
@ViewScoped
public class UsuarioController {

    private UsuarioModel user;
    private String usuarioMocado = "1";
    private String senhaMocada = "1";

    public String login(){
        if(this.verficarCampos()){
            return "sucesso";
        }
        return null;
    }
    
    private boolean verficarCampos(){
        return user.getPasswd().equals(this.usuarioMocado) && user.getUser().equals(this.senhaMocada);
    }
    
    @PostConstruct
    private void criaUsuarioMocado(){
        user = new UsuarioModel();
    }

    public UsuarioModel getUser() {
        return user;
    }

    public void setUser(UsuarioModel user) {
        this.user = user;
    }
    
    /**
     * Creates a new instance of UsuarioController
     */
    public UsuarioController() {
    }
    
}
