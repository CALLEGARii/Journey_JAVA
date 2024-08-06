package br.com.avaliacao_2.dao;
import java.sql.*;
import br.com.avaliacao_2.dto.ClienteDTO;

public class ClienteDAO{
    
    public ClienteDAO(){
       
    }
    
    private ResultSet rs = null;
    private Statement stmt = null;
   private Statement stmt1 = null;
   private Statement stmt2 = null;

    public boolean inserirCliente(ClienteDTO clienteDTO){
        
        try{
            
            ConexaoDAO.ConnectDB();
            
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "Insert into cliente (nome_cli, logradouro_cli, numero_cli,"
                + "bairro_cli, cidade_cli, estado_cli, cep_cli, cpf_cli, rg_cli) values ( "
                + "'" + clienteDTO.getNome_cli() + "', "
                + "'" + clienteDTO.getLogradouro_cli() + "', "
                + clienteDTO.getNumero_cli() + ", "
                + "'" + clienteDTO.getBairro_cli() + "', "
                + "'" + clienteDTO.getCidade_cli() + "', "
                + "'" + clienteDTO.getEstado_cli() + "', "
                + "'" + clienteDTO.getCep_cli() + "', "
                + "'" + clienteDTO.getCpf_cli() + "', "
                + "'" + clienteDTO.getRg_cli() + "'); ";

            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
              return true;
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }finally{
            ConexaoDAO.CloseDB();
        }       
    }
    
    public ResultSet consultarCliente(ClienteDTO clienteDTO, int opcao){
        
        try{
            ConexaoDAO.ConnectDB();
            
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "";
            
            switch(opcao){
                
                case 1:
                    comando = "SELECT c.* " +
                            "FROM cliente c " +
                            "WHERE nome_cli like '" + clienteDTO.getNome_cli() + "%' ORDER BY c.nome_cli";
                    break;
                case 2:
                    comando = "SELECT c.* " +
                            "FROM cliente c " + 
                            "WHERE c.id_cli = " + clienteDTO.getId_cli();
                    break;
                case 3:
                    comando = "SELECT c.id_cli, c.nome_cli, " +
                            "FROM cliente c ";
                                       
            }
            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;
            
        }catch(Exception e){
            
         System.out.println("Erro ao consultar clientes " + e.getMessage());
        }
        return rs;
    }
    
    
     public boolean alterarCliente(ClienteDTO clienteDTO){
        
        try{
            
            ConexaoDAO.ConnectDB();
            
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "Update cliente set "
                + "nome_cli = '" + clienteDTO.getNome_cli() + "', "
                + "logradouro_cli = '" + clienteDTO.getLogradouro_cli() + "', "
                + "numero_cli = " + clienteDTO.getNumero_cli() + ", "
                + "bairro_cli = '" + clienteDTO.getBairro_cli() + "', "
                + "cidade_cli = '" + clienteDTO.getCidade_cli() + "', "
                + "estado_cli = '" + clienteDTO.getEstado_cli() + "', "
                + "cep_cli = '" + clienteDTO.getCep_cli() + "', "
                + "cpf_cli = '" + clienteDTO.getCpf_cli() + "', "
                + "rg_Cli = '" + clienteDTO.getRg_cli() + "' "
                + "where id_cli = " + clienteDTO.getId_cli();
            
            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
              return true;
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }finally{
            ConexaoDAO.CloseDB();
        }       
    }
     
     public boolean excluirCliente(ClienteDTO clienteDTO){
        
        try{
            
            ConexaoDAO.ConnectDB();
            
            stmt = ConexaoDAO.con.createStatement();
            stmt1 = ConexaoDAO.con.createStatement();
            stmt2 = ConexaoDAO.con.createStatement();
            
            String comando = "Delete from cliente where id_cli =  "
                + clienteDTO.getId_cli();
            
            
            String comando2 = "Delete from venda where id_cli = "
                    + clienteDTO.getId_cli();
                 
            
            String comando3 = "Delete from produto_venda where id_cli = "
                    + clienteDTO.getId_cli();
            
            
            stmt1.execute(comando2.toUpperCase());
            ConexaoDAO.con.commit();
            
            stmt2.execute(comando3.toUpperCase());
            ConexaoDAO.con.commit();
            
            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            
              return true;
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
            
        }finally{
            ConexaoDAO.CloseDB();
        }
     }
     
     public ResultSet consultarPedidosCliente(int id_cli) {
    
    try {
        ConexaoDAO.ConnectDB();
        stmt = ConexaoDAO.con.createStatement();
    
        String comando = "SELECT id_vend, dat_vend, pg_vend, val_vend " +
                         "FROM venda " + 
                         "WHERE id_cli = " + id_cli;
        
        rs = stmt.executeQuery(comando.toUpperCase());
        System.out.println("PEDIDOS DO CLIENTE: " + rs);
        return rs;
        
    } catch (Exception e) {
        // Trata exceções e exibe mensagem de erro
        System.out.println("Erro ao consultar pedidos do cliente " + e.getMessage());
         return rs;
    }
   
}
     public ResultSet consultarProdutosVenda(int id_vend){
          try {
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "SELECT p.id_prod, p.nome_prod, pv.val_prod, pv.qtd_prod "
                    + "FROM produto p "
                    + "JOIN produto_venda pv ON p.id_prod = pv.id_prod "
                    + "WHERE pv.id_vend = " + id_vend;
            rs = stmt.executeQuery(comando);
            return rs;
        } catch (Exception e) {
            System.out.println("Erro na classe VendaDAO! " + e.getMessage());
            return null;
        }   
     }  
} // Fecha a Classe//