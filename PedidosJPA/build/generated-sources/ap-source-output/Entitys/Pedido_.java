package Entitys;

import Entitys.Item;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-23T19:14:47")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, String> cliente;
    public static volatile SingularAttribute<Pedido, Integer> codigo;
    public static volatile ListAttribute<Pedido, Item> itens;

}