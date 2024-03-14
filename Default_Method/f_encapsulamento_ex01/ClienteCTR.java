package f_encapsulamento_ex01;

public class ClienteCTR {
    ClienteDAO clienteDAO = new ClienteDAO();
    
    public String mostrarNomeRg(ClienteDTO clienteDTO){
        return clienteDAO.mostrarNomeRg(clienteDTO);
    }
    
    public String mostrarNomeIdade(ClienteDTO clienteDTO){
        return clienteDAO.mostrarNomeIdade(clienteDTO);
     
    }
    
}
