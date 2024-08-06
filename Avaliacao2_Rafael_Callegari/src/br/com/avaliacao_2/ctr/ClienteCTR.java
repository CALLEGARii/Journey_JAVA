package br.com.avaliacao_2.ctr;
import java.sql.ResultSet;
import br.com.avaliacao_2.dto.ClienteDTO;
import br.com.avaliacao_2.dao.ClienteDAO;
import br.com.avaliacao_2.dao.ConexaoDAO;

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
    
    public String alterarCliente(ClienteDTO clienteDTO){
         try{  
        if(clienteDAO.alterarCliente(clienteDTO)){   
            return "Cliente Alterado com Sucesso!!! ";
        }else{
            return " NÃO foi possivel Alterar!!! ";
          }
         }catch(Exception e){
             System.out.println(e.getMessage());
             return "Cliente NÃO Alterado! ";
         }  
       }
    
     public String excluirCliente(ClienteDTO clienteDTO){
         try{  
        if(clienteDAO.excluirCliente(clienteDTO)){   
            return "Cliente Excluído com Sucesso!!! ";
        }else{
            return "NÃO foi possivel excluir!!! ";
          }
         }catch(Exception e){
             System.out.println(e.getMessage());
             return "NÃO foi Possivel excluir! ";
         }  
       }
     
     public ResultSet consultarPedidosCliente(int id_cli){
         return clienteDAO.consultarPedidosCliente(id_cli);
     }
     
        public ResultSet consultarProdutosVenda(int id_vend){
         return clienteDAO.consultarProdutosVenda(id_vend);
     }
    
}//Fecha Classe//
