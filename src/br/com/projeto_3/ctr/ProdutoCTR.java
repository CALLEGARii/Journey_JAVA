package br.com.projeto_3.ctr;

import br.com.projeto_3.dao.ConexaoDAO;
import br.com.projeto_3.dto.FornecedorDTO;
import br.com.projeto_3.dto.ProdutoDTO;
import br.com.projeto_3.dao.ProdutoDAO;
import br.com.projeto_3.dao.FornecedorDAO;
import java.sql.ResultSet;

public class ProdutoCTR {
    
    ProdutoDAO produtoDAO = new ProdutoDAO();
       
    public ProdutoCTR(){
        
    }
    
    public ResultSet consultarProduto(ProdutoDTO produtoDTO, int opcao){
        
    ResultSet rs = null;
    rs = produtoDAO.consultarProduto(produtoDTO, opcao);
    return rs;
    }
    
    public String inserirProduto(ProdutoDTO produtoDTO, FornecedorDTO fornecedorDTO){
        try{
            if(produtoDAO.inserirProduto(produtoDTO, fornecedorDTO)){
                return "Produto Cadastrado com Sucesso!!! ";
            }else{
                return "Produto não Cadastrado!!! ";
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return "Produto não Cadastrado! ";
        }
    }
    
    public String alterarProduto(ProdutoDTO produtoDTO, FornecedorDTO fornecedorDTO){
        try{
            if(produtoDAO.alterarProduto(produtoDTO, fornecedorDTO)){
                return "Produto Alterado com Sucesso!!! ";
            }else{
                return "Produto não Alterado!!! ";
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return "Produto não Alterado! ";
        }
    }
    
    public String excluirProduto(ProdutoDTO produtoDTO, FornecedorDTO fornecedorDTO){
        try{
            if(produtoDAO.excluirProduto(produtoDTO, fornecedorDTO)){
                return "Produto Excluído com Sucesso!!! ";
            }else{
                return "Não foi possível excluir o Produto!!! ";
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return "Não foi possível excluir o Produto!! ";
        }
    }
    
    public void CloseDB(){
        ConexaoDAO.ConnectDB();
    }
}
