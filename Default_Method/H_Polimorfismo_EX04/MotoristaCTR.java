
package H_Polimorfismo_EX04;

public class MotoristaCTR {
    
    MotoristaDAO motoristaDAO = new MotoristaDAO();
    public String calcular(MotoristaDTO motoristaDTO){
        
        return motoristaDAO.calcular(motoristaDTO);
    
    }
    
}
