/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MbControllers;

import Models.ItemProduto;
import Models.Pedido;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author jeanfernandes
 */
@ManagedBean
@ViewScoped
public class PedidoMB {

    private Pedido pedido;
    private List<Pedido> list = new ArrayList<>();
    
    @PostConstruct
    public void init(){
        this.pedido = new Pedido();
    }
 
    public void inserirItem(ItemProduto p){
        this.pedido.setItem2list(p);
    }
    
    public void removerItem(ItemProduto p){
        this.pedido.removeItem2list(p);
    }
    
    public void novoItem(){
        this.pedido.novoItem();
    }
    
    public void inserir(){
        this.list.add(this.pedido);
        this.novo();
    }
    
    public void novo(){
        this.init();
    }
    
    public void remover(){
        this.remover(this.pedido);
    }
    
    public void remover(Pedido pedido){
        this.list.remove(pedido);
    }
    
    public String getTotal(){
        return String.valueOf(this.pedido.getTotalItens());
    }
    /**
     * Creates a new instance of PedidoMB
     */
    public PedidoMB() {
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    public void setItemPedido(ItemProduto p){
        this.pedido.setItem(p);
    }

    public List<Pedido> getList() {
        return list;
    }

    public void setList(List<Pedido> list) {
        this.list = list;
    }
    
}
