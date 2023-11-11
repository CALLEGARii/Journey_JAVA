package J_Vetor_EX01;

public class NumeroCTR {
    
   NumeroDAO numeroDAO = new NumeroDAO();
   
   public String Mostrar_Dados(NumeroDTO numeroDTO){
       
       return numeroDAO.Mostrar_Dados(numeroDTO);     
   }   
}