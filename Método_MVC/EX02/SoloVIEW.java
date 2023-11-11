package EX02;
import javax.swing.JOptionPane;

public class SoloVIEW {
    
    public static void main(String[] args){
        
        try{
            SoloCTR soloCTR = new SoloCTR();
            SoloDTO soloDTO = new SoloDTO();
            
            soloDTO.setAgua(Integer.parseInt
                (JOptionPane.showInputDialog("Informe a quantidade de água: ")));
            JOptionPane.showMessageDialog(null, soloCTR.calcular(soloDTO));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um ERRO");
        }
        
        
    }
    
    
    
    
    
}
