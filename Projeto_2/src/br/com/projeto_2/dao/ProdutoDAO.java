package br.com.projeto_2.dao;
import java.sql.*;
import br.com.projeto_2.dto.ProdutoDTO;
import br.com.projeto_2.dto.FornecedorDTO;

public class ProdutoDAO {
    
    public ProdutoDAO(){
        
    }
    
    private ResultSet rs = null;
    private Statement stmt = null;
    
    public boolean inserirProduto(ProdutoDTO produtoDTO, FornecedorDTO fornecedorDTO){
        try{
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "Insert into produto (nome_prod, desc_prod, cod_bar_prod, "
                    + "p_custo_prod, p_venda_prod, id_for) values ( "
                    + "'" + produtoDTO.getNome_prod() + "', "
                    + "'" + produtoDTO.getDesc_prod() + "', "
                    + "'" + produtoDTO.getCod_bar_prod() + "', "
                    + "'" + produtoDTO.getP_custo_prod() + "', "
                    + "'" + produtoDTO.getP_venda_prod() + "', "
                    + fornecedorDTO.getId_for() + ")";
            
            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            stmt.close();
            return true;
        }
          catch(Exception e){
              System.out.println("Error " + e.getMessage());
              return false;
        }
        finally{
            ConexaoDAO.CloseDB();  
        }
    }
    
    public boolean alterarProduto(ProdutoDTO produtoDTO, FornecedorDTO fornecedorDTO){
        try{
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "Update produto set "
                    + "nome_prod = '" + produtoDTO.getNome_prod() + "', "
                    + "desc_prod = '" + produtoDTO.getDesc_prod() + "', "
                    + "cod_bar_prod = '" + produtoDTO.getCod_bar_prod() + "', "
                    + "p_custo_prod = " + produtoDTO.getP_custo_prod() + ", "
                    + "p_venda_prod = " + produtoDTO.getP_venda_prod() + ", "
                    + "id_for = " + fornecedorDTO.getId_for() + " "
                    + "where id_prod = " + produtoDTO.getId_prod();
                    
            
            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            stmt.close();
            return true;
        }
          catch(Exception e){
              System.out.println("Error " + e.getMessage());
              return false;
        }
        finally{
            ConexaoDAO.CloseDB();          
        }
    }
    
    public boolean excluirProduto(ProdutoDTO produtoDTO, FornecedorDTO fornecedorDTO){
        try{
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "Delete from produto where id_prod = "
                             + produtoDTO.getId_prod();
                    
            
            stmt.execute(comando);
            ConexaoDAO.con.commit();
            stmt.close();
            return true;
        }
          catch(Exception e){
              System.out.println("Error " + e.getMessage());
              return false;
        }
        finally{
            ConexaoDAO.CloseDB();           
        }
    }
    
    public ResultSet consultarProduto(ProdutoDTO produtoDTO, int opcao){
        try{
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "";
            
            switch(opcao){
                case 1:
                    comando = "Select p.* " +
                            "from produto p " +
                            "where by p.nome_prod ilike '" + produtoDTO.getNome_prod() + "%'" +
                            "order by p.nome_prod ";
                    break;
                case 2:
                    comando = "Select p. *, f.nome_for, f.id_for " +
                            "from produto p, fornecedor f " + 
                            "where p.id_For = f.id_for and " +
                            "p.id_prod = " + produtoDTO.getId_prod();
                   break;
            }
             rs = stmt.executeQuery(comando.toUpperCase());
             return rs;
        }
         catch(Exception e){
             System.out.println("Error " + e.getMessage());
             return rs;
            
        }
    }       
}
