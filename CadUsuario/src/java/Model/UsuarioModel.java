/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Testes.TesteUsuario;
import java.util.Objects;

/**
 *
 * @author jeanfernandes
 */
public class UsuarioModel {
    
    private Integer codigo;
    private String nome;
    private String usuario;
    private String senha;
    private String email;
    private String estado;
    private String cidade;

    public UsuarioModel(Integer codigo, String nome, String usuario, String senha, String email, String estado, String cidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.email = email;
        this.estado = estado;
        this.cidade = cidade;
    }

    public UsuarioModel() {
    }
    
    public void testes(){
        Testes.TesteUsuario test = new TesteUsuario();
        test.init();
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UsuarioModel other = (UsuarioModel) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    
    
}
