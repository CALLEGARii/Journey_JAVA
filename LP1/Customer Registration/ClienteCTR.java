package Exercicio1;

public class ClienteCTR {
    
    ClienteDAO clienteDAO = new ClienteDAO();
    
    public String nomeRG(ClienteDTO clienteDTO){
        return clienteDAO.nomeRG(clienteDTO);
    }
    
    public String nomeIdade(ClienteDTO clienteDTO){
        return clienteDAO.nomeIdade(clienteDTO);
    }   
}
