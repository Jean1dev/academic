package Entitys;

import Entitys.Item;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pedido {
    
    @Id
    private Integer codigo;
    private String cliente;
    
    @OneToMany(fetch = FetchType.LAZY, 
            mappedBy = "pedido", 
            orphanRemoval = true, 
            cascade = CascadeType.ALL)
    private List<Item> itens = new ArrayList<Item>();

    public Double getTotal() {
        Double total = 0D;
        for(Item item: getItens()) {
            total += item.getTotal();
        }
        return total;
    }
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
    
    public void addItem(Item item) {
        item.setPedido(this);
        getItens().add(item);
    }
}
