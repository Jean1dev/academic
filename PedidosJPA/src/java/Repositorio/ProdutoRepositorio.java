package Repositorio;

import Entitys.Produto;
import aplicacao.JPA;
import java.util.List;
import javax.persistence.*;

public class ProdutoRepositorio {
    
    public static void salvar(Produto produto) {
        EntityManager em = JPA.getEM();
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.merge(produto);
        t.commit();
    }

    public static void excluir(Produto produto) {
        EntityManager em = JPA.getEM();
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.remove(em.find(Produto.class, produto.getCodigo()));
        t.commit();
    }

    public static Produto getProduto(Integer codigo) {
        EntityManager em = JPA.getEM();
        /*TypedQuery<Produto> query = em.createQuery("select x from Produto x where x.codigo = :cod", Produto.class);
        query.setParameter("cod", codigo);
        return query.getSingleResult();*/
        return em.find(Produto.class, codigo);
    }
    
    public static List<Produto> getProdutos() {
        EntityManager em = JPA.getEM();
        return em.createQuery("select p from Produto p", Produto.class).getResultList();
    }
    
    public static List<Produto> getProdutos(String valor) {
        EntityManager em = JPA.getEM();
        TypedQuery<Produto> query = em.createQuery("select x from Produto x where x.descricao like :valor", Produto.class);
        query.setParameter("valor", "%" + valor + "%");
        return query.getResultList();
    }
}
