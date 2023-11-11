package J_Vetor_EX01;

public class NumeroDAO {
    public String mensagem = "";
    
    public String Mostrar_Dados(NumeroDTO numeroDTO){
        
        int vetor[] = numeroDTO.getVetor();
        
        for(int cont =0; cont<vetor.length; cont++){
            
            if(cont %2 == 0){
                
                this.mensagem += vetor[cont] + "\n";
            }
            
        }
        
        return mensagem;
    }
    
}
