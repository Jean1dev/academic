/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBeans;

import testes.TDD;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import models.ProdutoModel;

/**
 *
 * @author jeanfernandes
 */
//@Named(value = "produtoMB")
//@Dependent
@ManagedBean
@ViewScoped
public class ProdutoMB{

    private ProdutoModel model;
    private List<ProdutoModel> listaProdutos = new ArrayList<ProdutoModel>();
    //private List<ProdutoModel> list = new ArrayList<ProdutoModel>();

    @PostConstruct
    public void init() {
        this.model = new ProdutoModel();
    }

    public void remover(int index) {
       
    }

    public void inserir() {
       this.listaProdutos.add(model); 
    }

    public void insertToListTeste() {
        ProdutoModel p = new ProdutoModel();
        p = p.getObjc();
        this.listaProdutos.add(p);
    }

    public ProdutoModel getModel() {
        return this.model;
    }

    public void setModelToObj(ProdutoModel model) {
        this.model = model;
    }

    public void novo() {

    }
    
    private void recarregaModel(){
        
    }

    private void release_all() {
       // this.liberaObjetos();
    }

    public void setListaProdutos(List<ProdutoModel> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public List<ProdutoModel> getListaProdutos() {
        return listaProdutos;
    }

    public void setModel(ProdutoModel model) {
        this.model = model;
    }
    
    public void Testar() {
        TDD tdd = new TDD();
        tdd.init();
    }

    /**
     * Creates a new instance of ProdutoMB
     */
    public ProdutoMB() {
    }

}
