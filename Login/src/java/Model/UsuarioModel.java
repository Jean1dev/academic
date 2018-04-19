/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author jeanfernandes
 */
public class UsuarioModel {
    
    private String user;
    private String passwd;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public UsuarioModel() {
    }

    public UsuarioModel(String user, String passwd) {
        this.user = user;
        this.passwd = passwd;
    }
    
    
}
