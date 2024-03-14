package Cadastro_Banco;

public interface IBancoDTO {
    
    void setNome(String nome);
    void setSexo(String sexo);
    void setCpf(int cpf);
    
    String getNome();
    String getSexo();
    int getCpf();
    
}
