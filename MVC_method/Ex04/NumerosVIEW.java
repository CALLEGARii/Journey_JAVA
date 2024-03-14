package Ex04;

import javax.swing.JOptionPane;

public class NumerosVIEW {
 
    public static void main(String args[]){
        
        try{
            
            NumerosDTO numerosDTO = new NumerosDTO();
            NumerosCTR numerosCTR = new NumerosCTR();
            
            numerosDTO.setNum1(Integer.parseInt(JOptionPane.showInputDialog("Informe o número 1: ")));
            numerosDTO.setNum2(Integer.parseInt(JOptionPane.showInputDialog("Informe o número 2: ")));
            numerosDTO.setNum3(Integer.parseInt(JOptionPane.showInputDialog("Informe o número 3: ")));
            
            JOptionPane.showMessageDialog(null, numerosCTR.mostrar(numerosDTO));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro " + e.getMessage());
        }
        
    }
    
}
