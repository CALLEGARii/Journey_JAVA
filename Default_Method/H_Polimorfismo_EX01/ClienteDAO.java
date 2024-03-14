package H_Polimorfismo_EX01;

import sun.security.provider.VerificationProvider;


public class ClienteDAO {
    
    public String Mostrar(ClienteDTO clienteDTO){
        
        return "O nome Informado: " + clienteDTO.getNome() + 
                "\n o RG informado Foi: " + clienteDTO.getRg() + 
                verifica(clienteDTO.getIdade()) +
                verifica(clienteDTO.getAltura());
       
    }
    
    private String verifica(int idade){
        
        if(idade >= 18){
            return "\nPode entrar no Brinquedo: ";
        }
        else{
            return "\nNao pode entrar no Brinquedo: ";   
    }
        
 }       
        
    private String verifica(double altura){
            if(altura >= 1.50){
                return "\n Pode entrar no brinquedo: ";
            }
            else{
                return "\n Nao pode entrar no brinquedo: ";
            }
            
        }
 
}