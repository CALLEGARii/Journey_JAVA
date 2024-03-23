package br.com.avaliacao_1.ctr;

import java.sql.ResultSet;
import br.com.avaliacao_1.dto.FornecedorDTO;
import br.com.avaliacao_1.dao.ConexaoDAO;
import br.com.avaliacao_1.dao.FornecedorDAO;

public class FornecedorCTR {
    
    FornecedorDAO fornecedorDAO = new FornecedorDAO();
    
    public FornecedorCTR(){
        
    }
    
    public String inserirFornecedor(FornecedorDTO fornecedorDTO){
        
        try{
            if(fornecedorDAO.inserirFornecedor(fornecedorDTO)){
                return "Fornecedor Cadastrado com Sucesso! "; 
            }else{
                return "Não foi possível Cadastrar! ";
            }
        }
        
        catch(Exception e){
            System.out.println(e.getMessage());
            return "Não foi possível Cadastrar! ";
        }
    }
    
    public ResultSet consultarFornecedor(FornecedorDTO fornecedorDTO, int opcao){
        
        ResultSet rs = null;
        rs = this.fornecedorDAO.consultarFornecedor(fornecedorDTO, opcao);
        return rs;
    }
}
