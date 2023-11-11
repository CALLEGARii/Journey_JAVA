package H_Polimorfismo_EX04;
import javax.swing.JOptionPane;

public class MotoristaVIEW {
    
    public static void main(String[] args){
        
        try{
            
            MotoristaDTO motoristaDTO = new MotoristaDTO();
            MotoristaCTR motoristaCTR = new MotoristaCTR();
            
            
            motoristaDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade: ")));
            
            JOptionPane.showMessageDialog(null, motoristaCTR.calcular(motoristaDTO));
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null,"Erro no sistema! " + e.getMessage());
        }
         
    }
    
}
