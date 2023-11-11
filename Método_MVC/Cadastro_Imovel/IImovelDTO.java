package Cadastro_Imovel;

public interface IImovelDTO {
    
    void setCidade(String cidade);
    void setEndereco(String endereco);
    void setBairro(String bairro);
    void setNumero(int numero);
    void setProprietario(String proprietario);
    
    String getCidade();
    String getEndereco();
    String getBairro();
    int getNumero();
    String getProprietario();
    
}
