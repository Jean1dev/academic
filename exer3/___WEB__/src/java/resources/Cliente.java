/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author comp8
 */
@ManagedBean
@ViewScoped
public class Cliente {

    private int codigo;
    private String nome;
    private long tel;
    private long cel;
    private String email;
    private long cpf;
    private long cnpj;
    private Date dtnascimento;
    private String nomeFantasia;
    private String cidade;
    private String rua;
    private String estado;

    public Cliente(int codigo, String nome, long tel, long cel, String email, long cpf, long cnpj, Date dtnascimento, String nomeFantasia, String cidade, String rua, String estado) {
        this.codigo = codigo;
        this.nome = nome;
        this.tel = tel;
        this.cel = cel;
        this.email = email;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.dtnascimento = dtnascimento;
        this.nomeFantasia = nomeFantasia;
        this.cidade = cidade;
        this.rua = rua;
        this.estado = estado;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public Date getDtnascimento() {
        return dtnascimento;
    }

    public void setDtnascimento(Date dtnascimento) {
        this.dtnascimento = dtnascimento;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public long getCel() {
        return cel;
    }

    public void setCel(long cel) {
        this.cel = cel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    /**
     * Creates a new instance of Cliente_
     */
    public Cliente() {
    }
    
}
