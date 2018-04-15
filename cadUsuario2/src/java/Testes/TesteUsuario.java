/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import ManagedBean.UsuarioController;

/**
 *
 * @author jeanfernandes
 */
public class TesteUsuario {
    
    private UsuarioController ctrl;
    
    public void init(){
        ctrl = new UsuarioController();
        ctrl.criaObjtoModel();
        ctrl.inserir();
        ctrl.remover();
    }
    
}
