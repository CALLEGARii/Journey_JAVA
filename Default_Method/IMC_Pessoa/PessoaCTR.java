package IMC_Pessoa;

public class PessoaCTR {
    
    PessoaDAO pessoaDAO = new PessoaDAO();
    
    public String Mostrar_Dados(PessoaDTO pessoaDTO){
        
        return pessoaDAO.Mostrar_Dados(pessoaDTO);
        
    }
        
}
