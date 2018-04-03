/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBeans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ViewScoped;
import models.ProdutoModel;

/**
 *
 * @author jeanfernandes
 */
@Named(value = "produtoMB")
@Dependent
@ViewScoped
public class ProdutoMB {

    private ProdutoModel model;
    private List<ProdutoModel> list = new ArrayList<>();
    
    @PostConstruct
    public void init(){
        this.model = new ProdutoModel();    
    }
    
    public void remover(){
      this.list.remove(model);
      this.model.setListaProdutos(list);
    }
    
    public void inserir(){
      this.list.add(model);
      this.model.setListaProdutos(list);
    }
    
    public void novo(){
        this.list = model.getListaProdutos();
    }
    /**
     * Creates a new instance of ProdutoMB
     */
    public ProdutoMB() {
    }
    
}
