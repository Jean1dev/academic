/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author jeanfernandes
 */
@ManagedBean
@ViewScoped
public class NewJSFManagedBean {

    private String email, cpf, cnpj, msg;
    private static final String EMAIL_PATTERN
            = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    
    private static final String CPF_PATTERN = "^([0-9]{3}\\.?){3}-?[0-9]{2}$";
    
    private static final String CNPJ_PATTERN = "([0-9]{2}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[\\/]?[0-9]{4}[-]?[0-9]{2})|([0-9]{3}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[-]?[0-9]{2})\n" +
"C";

    public boolean validaCampo(String campo, String regex) {
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(campo);
        return matcher.matches();
    }

    public void validar() {
        this.msg = "";
        if (!this.validaCampo(this.email, this.EMAIL_PATTERN)) {
            this.msg = "email incorreto";
        }
        if(!this.validaCampo(this.cpf, this.CPF_PATTERN)){
            this.msg = this.msg + " cpf incorreto";
        }
        if(!this.validaCampo(this.cnpj, this.CNPJ_PATTERN)){
            this.msg = this.msg + " cnpj incorreto";
        }
    }

    public String getMsg() {
        return msg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public NewJSFManagedBean() {
    }

}
