package IMC_Pessoa;

public class PessoaDTO extends ImcDTO implements IPessoaDTO{
    
    private String nome;
    private String sexo;
    private double cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }
    
}
