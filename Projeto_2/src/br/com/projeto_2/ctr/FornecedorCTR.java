package br.com.projeto_2.ctr;
import java.sql.ResultSet;
import br.com.projeto_2.dto.FornecedorDTO;
import br.com.projeto_2.dao.FornecedorDAO;
import br.com.projeto_2.dao.ConexaoDAO;

public class FornecedorCTR {
    
    FornecedorDAO fornecedorDAO = new FornecedorDAO();

    public FornecedorCTR(){      
    }
    
    public String inserirFornecedor(FornecedorDTO fornecedorDTO){
        
        try{
            if(fornecedorDAO.inserirFornecedor(fornecedorDTO)){
                return "Fornecedor Cadastrado com Sucesso!! ";
            }else{
                return "Fornecedor Não Cadastrado!!! ";
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return "Fornecedor Não Cadastrado!!! ";
        }
    }
    
     public String alterarFornecedor(FornecedorDTO fornecedorDTO){
        
        try{
            if(fornecedorDAO.alterarFornecedor(fornecedorDTO)){
                return "Fornecedor alterado com Sucesso!! ";
            }else{
                return "Fornecedor Não Alterado!!! ";
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return "Fornecedor Não Alterado!!! ";
        }
    }
     
     public String excluirFornecedor(FornecedorDTO fornecedorDTO){
        
        try{
            if(fornecedorDAO.excluirFornecedor(fornecedorDTO)){
                return "Fornecedor excluído com Sucesso!! ";
            }else{
                return "Não foi Possível Excluir o Fornecedor!!! ";
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return "Não foi Possível Excluir o Fornecedor!!! ";
        }
    }
     
     public ResultSet consultarFornecedor(FornecedorDTO fornecedorDTO, int opcao){
         
         ResultSet rs = null;
         rs = fornecedorDAO.consultarFornecedor(fornecedorDTO, opcao);
         return rs;
     }
     
     public void CloseDB(){
         ConexaoDAO.CloseDB();
     }
}
