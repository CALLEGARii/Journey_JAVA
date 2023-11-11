package J_Vetor_EX02;

public class AlgoritmoCTR {
    
    AlgoritmoDAO algoritmoDAO = new AlgoritmoDAO();
    
    public String Mostrar_Dados(AlgoritmoDTO algoritmoDTO){
        
        return algoritmoDAO.Mostrar_Dados(algoritmoDTO);
    }  
}
