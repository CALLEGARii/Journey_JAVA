package f_encapsulamento_ex01;

public class ClienteDAO {
 
public String mostrarNomeRg(ClienteDTO clienteDTO){
    return "O nome informado foi: " 
    + clienteDTO.getNome() + "\n o RG informado foi: " 
    + clienteDTO.getRg();
  
}    
    
  public String mostrarNomeIdade(ClienteDTO clienteDTO){
      
      return "O nome informado foi: " 
      + clienteDTO.getNome() 
      + "\n A idade informada foi: " + clienteDTO.getIdade();
      
      
     }
   
}
