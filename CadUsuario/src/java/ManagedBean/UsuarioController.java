/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBean;

import Model.UsuarioModel;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author jeanfernandes
 */
@Named(value = "usuarioController")
@ViewScoped
public class UsuarioController {

    private UsuarioModel model;
    private List<UsuarioModel> list = new ArrayList<>();
    
    @PostConstruct
    public void novo(){
        this.novoUsuario();
    }

    public UsuarioModel getModel() {
        return model;
    }

    public void setModel(UsuarioModel model) {
        this.model = model;
    }

    public List<UsuarioModel> getList() {
        return list;
    }

    public void setList(List<UsuarioModel> list) {
        this.list = list;
    }
    
    public void remover(){
        this.list.remove(model);
    }
    
    public void inserir(){
        this.list.add(model);
        this.novoUsuario();
    }
    
    public void criaObjtoModel(){
        this.model = new UsuarioModel(1, "nome", "usuario", "senha", "email", "estado", "cidade");
    }
    
    private void novoUsuario(){
        this.model = new UsuarioModel();
    }
    
    private void releaseAll(){
        model = new UsuarioModel();
        list = new ArrayList<>();
    }
    
    /**
     * Creates a new instance of UsuarioController
     */
    public UsuarioController() {
    }
    
}
