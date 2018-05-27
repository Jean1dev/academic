package Entitys;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Item {
    
    @Id
    private Integer codigo;
    
    private Integer quantidade;
    
    @ManyToOne(fetch = FetchType.LAZY)
    //@ForeignKey(name = "fk_item_produto")
    @JoinColumn(name = "cod_produto")
    private Produto produto;
    
    private Double valor;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_pedido")
    private Pedido pedido;

    public Double getTotal() {
        return getQuantidade() * getValor();
    }
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    

    
    
}
