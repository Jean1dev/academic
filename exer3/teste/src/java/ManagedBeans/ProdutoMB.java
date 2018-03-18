/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBeans;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author jeanfernandes
 */
@Named(value = "produtoMB")
@Dependent
public class ProdutoMB {

    /**
     * Creates a new instance of ProdutoMB
     */
    public ProdutoMB() {
    }
    
}
