/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeanfernandes
 */
public class Pedido {
    
    private String cliente;
    private String endereco;
    private ItemProduto item = new ItemProduto();
    private List<ItemProduto> itens = new ArrayList<>();

    public ItemProduto getItem() {
        return item;
    }

    public void setItem(ItemProduto item) {
        this.item = item;
    }
    
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<ItemProduto> getItens() {
        return itens;
    }

    public void setItens(List<ItemProduto> itens) {
        this.itens = itens;
    }
    
    public void setItem2list(ItemProduto item){
        this.itens.add(item);
    }
    
    public void removeItem2list(ItemProduto item){
        this.itens.remove(item);
    }
    
    public Double getTotalItens(){
        double ret = 0;
        for (ItemProduto item : itens) {
            ret = ret + item.getPreco();
        }
        
        return ret;
    }

    public Pedido() {
    }
    
    
    
}
