import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean (name = "conversorMB")
@ViewScoped
public class ConversorMB {

    private String cpf, cnpj;

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
    
    public ConversorMB() {
    }
    
}
