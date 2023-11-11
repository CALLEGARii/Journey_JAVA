
package H_Polimorfismo_EX01;

public class ClienteCTR {
    
    ClienteDAO clienteDAO = new ClienteDAO();
    
    public String Mostrar(ClienteDTO clienteDTO){
        
       return clienteDAO.Mostrar(clienteDTO);
    }

}