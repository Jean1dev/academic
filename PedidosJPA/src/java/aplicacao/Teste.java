package aplicacao;

import Repositorio.ProdutoRepositorio;
import Entitys.Produto;
import Entitys.Pedido;
import Entitys.Item;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class Teste {

    public static void main(String[] args) {
        /*Produto p = ProdutoRepositorio.getProduto(2);
        
        Item i = new Item();
        i.setCodigo(1);
        i.setProduto(p);
        
        EntityManager em = JPA.getEM();
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.merge(i);
        t.commit();*/
        
        /*
        EntityManager em = JPA.getEM();
        Item item = em.find(Item.class, 1);
        System.out.println("codigo: " + item.getCodigo());
        System.out.println("produto: " + item.getProduto().getDescricao());
        */
        
        EntityManager em = JPA.getEM();
        EntityTransaction t = em.getTransaction();
        t.begin();
        Pedido pedido = new Pedido();
        pedido.setCodigo(1);
        pedido.setCliente("Maria");
        
        Item a = new Item();
        a.setCodigo(1);
        Produto prod2 = ProdutoRepositorio.getProduto(5);
        a.setProduto(prod2);
        a.setQuantidade(2);
        a.setValor(20.5);
        pedido.addItem(a);
        
        em.merge(pedido);
        
        System.out.println("Total: " + pedido.getTotal());
        
        t.commit();
        
    }
    
}
