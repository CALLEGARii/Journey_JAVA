package H_Polimorfismo_EX04;

public class MotoristaDAO {
    
    private String mensagem;
    
    public String calcular(MotoristaDTO motoristaDTO){
        
        if(motoristaDTO.getIdade() >= 18){
            this.mensagem = "O motorista pode ter a CNH: ";
        }
        else{
            this.mensagem = "O motorista nao pode ter a CNH: ";
        }
        
        return this.mensagem;
    }
    
}
