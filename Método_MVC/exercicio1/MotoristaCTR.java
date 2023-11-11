
package exercicio1;

public class MotoristaCTR {
    MotoristaDAO motoristaDAO = new MotoristaDAO();
    
    public String mostrarIdade(MotoristaDTO motoristaDTO){
        return motoristaDAO.Idade(motoristaDTO);
    
    }
   
}
