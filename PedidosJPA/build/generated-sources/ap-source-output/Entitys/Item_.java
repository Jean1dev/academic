package Entitys;

import Entitys.Pedido;
import Entitys.Produto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-23T19:14:47")
@StaticMetamodel(Item.class)
public class Item_ { 

    public static volatile SingularAttribute<Item, Integer> codigo;
    public static volatile SingularAttribute<Item, Produto> produto;
    public static volatile SingularAttribute<Item, Double> valor;
    public static volatile SingularAttribute<Item, Pedido> pedido;
    public static volatile SingularAttribute<Item, Integer> quantidade;

}