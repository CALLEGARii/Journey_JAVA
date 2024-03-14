package IMC_Pessoa;

public interface IPessoaDTO{
    
    void setNome(String nome);
    void setSexo(String sexo);
    void setCpf(double cpf);
    
    String getNome();
    String getSexo();
    double getCpf();
      
}
