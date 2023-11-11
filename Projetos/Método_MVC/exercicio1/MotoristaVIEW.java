package exercicio1;
import javax.swing.JOptionPane;

public class MotoristaVIEW {
    public static void main(String args[]){
        try{
            MotoristaDTO motoristaDTO  = new MotoristaDTO();
            MotoristaCTR motoristaCTR = new MotoristaCTR();
            
            
            motoristaDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a Idade ")));
            
            
            JOptionPane.showMessageDialog(null,motoristaCTR.mostrarIdade(motoristaDTO));
         
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, " Erro no Sistema: " + e.getMessage());
          
        }
        
        
    }
    
}
