/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Entitys.Cliente;
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
public class ClienteMB {
    
    private Cliente cliente;
    private List<Cliente> lista;
    
    @PostConstruct
    public void NovoRegistro(){
        this.novo();
        this.atualizarLista();
    }
    
    public void novo(){
        this.cliente = new Cliente();
    }
    
    public void atualizarLista(){
        this.lista = this.cliente.getClientes();
    }
    
    public void salvar(){
        this.cliente.salvar();
    }
    
    public void excluir(){
        this.excluir(cliente);
    }
    
    public void excluir(Cliente cli){
        this.cliente.excluir();
        this.NovoRegistro();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getLista() {
        return lista;
    }

    public void setLista(List<Cliente> lista) {
        this.lista = lista;
    }
    
}
