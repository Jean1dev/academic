/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorio;

import Entitys.Cliente;
import java.util.List;

/**
 *
 * @author jeanfernandes
 */
public class ClienteRepositorio extends RepositorioGeneral{
    
    public Cliente getCliente(Integer cod){
        return Entity.find(Cliente.class, cod);
    }
    
    public List<Cliente> getClientes(){
        return Entity.createQuery("select * from cliente", Cliente.class).getResultList();
    }
    
}
