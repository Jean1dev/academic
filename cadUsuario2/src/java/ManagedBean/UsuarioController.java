/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBean;

import Model.RegiaoModel;
import Model.UsuarioModel;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author jeanfernandes
 */
@ManagedBean
@ViewScoped
//@SessionScoped
public class UsuarioController {

    private UsuarioModel model;
    private RegiaoModel regiao;
    private List<UsuarioModel> list = new ArrayList<>();
    private List<RegiaoModel> listReg = new ArrayList<>();
    
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

    public RegiaoModel getRegiao() {
        return regiao;
    }

    public void setRegiao(RegiaoModel regiao) {
        this.regiao = regiao;
    }

    public List<RegiaoModel> getListReg() {
        return listReg;
    }

    public void setListReg(List<RegiaoModel> listReg) {
        this.listReg = listReg;
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
        this.regiao = new RegiaoModel("teste");
        this.listReg.add(regiao);
    }
    
    private void releaseAll(){
        model = new UsuarioModel();
        list = new ArrayList<>();
    }
    
    public void nada(){
        
    }
    /**
     * Creates a new instance of UsuarioController
     */
    public UsuarioController() {
    }
    
}
