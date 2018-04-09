package testes;


import ManagedBeans.ProdutoMB;
import models.ProdutoModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeanfernandes
 */
public class TDD {
    
    private ProdutoModel model;
    private ProdutoMB controller;
    
    public void init(){
        model = new ProdutoModel();
        controller = new ProdutoMB();
        
        model.iniciaObj();
        //model.getListCount();
        controller.setModelToObj(model);
        controller.inserir();
        //model.getListCount();
        //controller.remover();
    }

    public TDD() {
    }
   
    
}
