/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import ManagedBeans.ProdutoMB;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author jeanfernandes
 */
@ViewScoped
@ManagedBean
public class ProdutoModel {
    
    private int codigo;
    private String descricao;
    private double preco;
    private int estoque;
    private String categoria;
    private int qtdList;
    private ProdutoMB ctrl = new ProdutoMB();
/*    
    public void insertToListTeste(){
        ProdutoModel p = new ProdutoModel();
        p = this.getObjc();
        this.listaProdutos.add(p);
    }

    protected void insert2list(){
        this.listaProdutos.add(this);
    }
    
    protected void remove2list(int index){
        this.listaProdutos.remove(index);
    }
    
    protected void liberaObjetos(){
        this.listaProdutos = new ArrayList<>();
        
    }
    
    public List<ProdutoModel> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<ProdutoModel> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
    
    public void getListCount(){
        this.qtdList = this.listaProdutos.size();
        System.out.println("quantidade " + this.qtdList);
    }
*/
    
    public ProdutoModel() {
    }
    
    public ProdutoModel getObjc(){
        return this;
    }

    @PostConstruct
    public void iniciaObj(){
        this.codigo = 2;
        this.descricao = "teste";
        this.estoque = 5;
        this.categoria = "teste";
        this.vaiporra();
    }
    
    public ProdutoModel(int codigo, String descricao, double preco, int estoque, String categoria) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.codigo;
        hash = 97 * hash + Objects.hashCode(this.descricao);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.preco) ^ (Double.doubleToLongBits(this.preco) >>> 32));
        hash = 97 * hash + this.estoque;
        hash = 97 * hash + Objects.hashCode(this.categoria);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProdutoModel other = (ProdutoModel) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (Double.doubleToLongBits(this.preco) != Double.doubleToLongBits(other.preco)) {
            return false;
        }
        if (this.estoque != other.estoque) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        return true;
    }
    
    public void inserir(){
        this.ctrl.setModelToObj(this);
        this.ctrl.inserir();
    }
    
    
    //======================================================
    private List<String> testelist = new ArrayList<>();

    public void vaiporra(){
        testelist.add(descricao);
        testelist.add(descricao);
        testelist.add(descricao);
        testelist.add(descricao);
        testelist.add(descricao);
    }

    public List<String> getTestelist() {
        return testelist;
    }
    
    
}
