
package f_encapsulamento_ex04;

public class LancheCTR {
    
      LancheDAO lancheDAO = new LancheDAO();
      
      public void calculo(LancheDTO lancheDTO){
           lancheDAO.calculo(lancheDTO);
          
      }
    
}
