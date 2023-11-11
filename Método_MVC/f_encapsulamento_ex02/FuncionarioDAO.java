package f_encapsulamento_ex02;


public class FuncionarioDAO {
    
    public String imprimir(FuncionarioDTO funcionarioDTO){
        return "O codigo informado foi: " + 
        funcionarioDTO.getCodigo() 
        + "\n O telefone informado foi: " +        
        funcionarioDTO.getTelefone();
        
    }
    
}
