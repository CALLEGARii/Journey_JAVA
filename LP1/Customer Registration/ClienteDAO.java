package Exercicio1;

public class ClienteDAO {
    
    public String nomeRG(ClienteDTO clienteDTO){
        
        return "O nome informado foi: " + clienteDTO.getNome() +
                "\nO RG iformado foi: " + clienteDTO.getRg();
    }
    
    public String nomeIdade(ClienteDTO clienteDTO){
        
        return "O nome informado foi: " + clienteDTO.getNome() +
                "\nA idade informada foi: " + clienteDTO.getIdade();
    }   
}
