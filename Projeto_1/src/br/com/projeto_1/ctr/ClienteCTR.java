package br.com.projeto_1.ctr;
import java.sql.ResultSet;
import br.com.projeto_1.dto.ClienteDTO;
import br.com.projeto_1.dao.ClienteDAO;
import br.com.projeto_1.dao.ConexaoDAO;

public class ClienteCTR {
    
    ClienteDAO clienteDAO = new ClienteDAO();
    
    public ClienteCTR(){
        
    }
    
    public String inserirCliente(ClienteDTO clienteDTO){
         try{  
        if(clienteDAO.inserirCliente(clienteDTO)){   
            return "Cliente Cadastrado com Sucesso!!! ";
        }else{
            return "Cliente NÃO Cadastrado!!! ";
          }
         }catch(Exception e){
             System.out.println(e.getMessage());
             return "Cliente NÃO Cadastrado! ";
         }  
       }
    
    public ResultSet consultarCliente(ClienteDTO clienteDTO, int opcao){
        
        ResultSet rs = null;       
        rs = clienteDAO.consultarCliente(clienteDTO, opcao);
        
        return rs;
    }
    
    public void CloseDB(){
        ConexaoDAO.CloseDB();
    }
}//Fecha Classe//
