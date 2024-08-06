package br.com.avaliacao_2.ctr;
import java.sql.ResultSet;
import br.com.avaliacao_2.dto.FuncionarioDTO;
import br.com.avaliacao_2.dao.FuncionarioDAO;
import br.com.avaliacao_2.dao.ConexaoDAO;

public class FuncionarioCTR {
    
    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    
    public FuncionarioCTR(){   
    }
    
    public String inserirFuncionario(FuncionarioDTO funcionarioDTO){
         try{  
        if(funcionarioDAO.inserirFuncionario(funcionarioDTO)){   
            return "Funcionario Cadastrado com Sucesso!!! ";
        }else{
            return "Funcionario NÃO Cadastrado!!! ";
          }
         }catch(Exception e){
             System.out.println(e.getMessage());
             return "Funcionario NÃO Cadastrado! ";
         }  
       }
    
    public ResultSet consultarFuncionario(FuncionarioDTO FuncionarioDTO, int opcao){
        
        ResultSet rs = null;       
        rs = funcionarioDAO.consultarFuncionario(FuncionarioDTO, opcao);
        return rs;
    }
      
    public String alterarFuncionario(FuncionarioDTO funcionarioDTO){
            try{  
           if(funcionarioDAO.alterarFuncionario(funcionarioDTO)){   
               return "Funcionario Alterado com Sucesso!!! ";
           }else{
               return " NÃO foi possivel Alterar!!! ";
            }
         }catch(Exception e){
             System.out.println(e.getMessage());
             return "Funcionario NÃO Alterado! ";
        }            
    }
    
     public String excluirFuncionario(FuncionarioDTO funcionarioDTO){
        try{  
            if(funcionarioDAO.excluirFuncionario(funcionarioDTO)){   
                return "Funcionario Excluído com Sucesso!!! ";
            }else{
                return "NÃO foi possivel excluir!!! ";
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            return "NÃO foi Possivel excluir! ";
        }  
    }
     public void CloseDB(){
     ConexaoDAO.CloseDB();
    }
         
    public String logarFuncionario(FuncionarioDTO funcionarioDTO){
        return funcionarioDAO.logarFuncionario(funcionarioDTO);
    }         
}//Fecha Classe//
