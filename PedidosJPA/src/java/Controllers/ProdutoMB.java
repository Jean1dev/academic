package Controllers;

import Entitys.Produto;
import Repositorio.ProdutoRepositorio;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ProdutoMB {

    private Produto produto;
    private List<Produto> lista;
    
    public ProdutoMB() {
        novo();
        atualizarLista();
    }
    
    public void atualizarLista() {
        lista = ProdutoRepositorio.getProdutos();
    }
    
    public void novo() {
        produto = new Produto();
    }

    public void salvar() {
        ProdutoRepositorio.salvar(produto);
        atualizarLista();
    }
    
    public void excluir() {
        excluir(this.produto);
    }
    
    public void excluir(Produto produto) {
        ProdutoRepositorio.excluir(produto);
        atualizarLista();
        novo();
    }
    
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public List<Produto> getLista() {
        return lista;
    }

    public void setLista(List<Produto> lista) {
        this.lista = lista;
    }
    
    
}
