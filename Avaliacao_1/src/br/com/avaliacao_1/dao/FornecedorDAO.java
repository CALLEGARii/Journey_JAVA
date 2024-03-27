package br.com.avaliacao_1.dao;
import java.sql.*;
import br.com.avaliacao_1.dto.FornecedorDTO;

public class FornecedorDAO {

    
    public FornecedorDAO(){
        
    }
    
    private ResultSet rs = null;
    private Statement stmt = null;
    
    public boolean inserirFornecedor(FornecedorDTO fornecedorDTO){
        
        try{
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "Insert into fornecedor (nome_forn, logradouro_forn, numero_forn, "
                    + "telefone_forn, bairro_forn, cidade_forn, estado_forn, cep_forn, cnpj_forn) values ("
                    + "'" + fornecedorDTO.getNome_forn() + "', "
                    + "'" + fornecedorDTO.getLogradouro_forn() + "', "
                    + fornecedorDTO.getNumero_forn() + ", "
                    + fornecedorDTO.getTelefone_forn() + ", "
                    + "'" + fornecedorDTO.getBairro_forn() + "', "
                    + "'" + fornecedorDTO.getCidade_forn() + "', "
                    + "'" + fornecedorDTO.getEstado_forn() + "', "
                    + "'" + fornecedorDTO.getCep_forn() + "', "
                    + "'" + fornecedorDTO.getCnpj_forn() + "'); ";
                    
            
            stmt.execute(comando.toUpperCase());
            
            ConexaoDAO.con.commit();
            stmt.close();
            return true;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        finally {
            ConexaoDAO.CloseDB();
        }
    }
    
    public ResultSet consultarFornecedor(FornecedorDTO fornecedorDTO, int opcao){
        
        try{
            ConexaoDAO.ConnectDB();
            
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "";
            
            switch(opcao){
                
                case 1:
                    comando = "SELECT c.* " +
                            "FROM fornecedor c " +
                            "WHERE nome_forn like '" + fornecedorDTO.getNome_forn() + "%' ORDER BY c.nome_forn";
                    break;
                case 2:
                    comando = "SELECT c.* " +
                            "FROM fornecedor c " + 
                            "WHERE c.id_forn = " + fornecedorDTO.getId_forn();
                    break;
                case 3:
                    comando = "SELECT c.id_forn, c.nome_forn, " +
                            "FROM fornecedor c ";
                                       
            }
            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;
            
        }catch(Exception e){
            
         System.out.println("Erro ao consultar Fornecedores " + e.getMessage());
        }
        return rs;
    }
    
    public boolean alterarFornecedor(FornecedorDTO fornecedorDTO){
        
     try{
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "Update fornecedor set "
                    + "nome_forn = '" + fornecedorDTO.getNome_forn() + "', "
                    + "logradouro_forn = '" + fornecedorDTO.getLogradouro_forn() + "', "
                    + "numero_forn = " + fornecedorDTO.getNumero_forn() + ", "
                    + "telefone_forn = " + fornecedorDTO.getTelefone_forn() + ", "
                    + "bairro_forn = '" + fornecedorDTO.getBairro_forn() + "', "
                    + "cidade_forn = '" + fornecedorDTO.getCidade_forn() + "', "
                    + "estado_forn = '" + fornecedorDTO.getEstado_forn() + "', "
                    + "cep_forn = '" + fornecedorDTO.getCep_forn() + "', "
                    + "cnpj_forn = '" + fornecedorDTO.getCnpj_forn() + "' "
                    + "where id_forn = " + fornecedorDTO.getId_forn();
       
            stmt.execute(comando.toUpperCase());
            
            ConexaoDAO.con.commit();
            stmt.close();
            return true;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        finally {
            ConexaoDAO.CloseDB();
        }

     }
    
    public boolean excluirFornecedor(FornecedorDTO fornecedorDTO){
        
        try{
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "Delete from fornecedor where id_forn = "
                             + fornecedorDTO.getId_forn();
            
            stmt.execute(comando);
            ConexaoDAO.con.commit();
            stmt.close();
            return true;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        finally{
            ConexaoDAO.ConnectDB();
        }
    }
}//Fecha a classe