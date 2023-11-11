package H_Polimorfismo_EX03;

public class JuridicoDTO extends ClienteDTO{
    
    private String cnpj;
    private String ie;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }
}