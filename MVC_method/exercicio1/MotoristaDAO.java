
package exercicio1;

public class MotoristaDAO {
    private String messagem;
    public String Idade(MotoristaDTO motoristaDTO){
         
        if(motoristaDTO.getIdade() >=18){
           this.messagem = "CNH autorizado "; 
           
        }
        else{
            this.messagem = "Nao pode ter CNH ";
        }
        return this.messagem;
   }
    
}


