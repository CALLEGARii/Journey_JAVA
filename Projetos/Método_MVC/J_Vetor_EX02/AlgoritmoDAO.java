package J_Vetor_EX02;

public class AlgoritmoDAO {
    
    public String mensagem = "";
    
    public String Mostrar_Dados(AlgoritmoDTO algoritmoDTO){
        
        int vetor[] = algoritmoDTO.getVetor();
        
        for(int cont =19; cont >=0; cont--){
            
            this.mensagem += vetor[cont] + "\n";
        }
        
        return mensagem;
    }
    
}
