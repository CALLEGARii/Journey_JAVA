package teste;

public class PessoaCTR {
    
  PessoaDAO pessoaDAO = new PessoaDAO();
  
    public String calculo(PessoaDTO pessoaDTO){
        
        return pessoaDAO.calculo(pessoaDTO);
        
    }
              
}
