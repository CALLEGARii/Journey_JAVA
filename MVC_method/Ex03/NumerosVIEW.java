package ex03;

import javax.swing.JOptionPane;

public class NumerosVIEW {
    
    public static void main(String[] args){
        
        NumerosDTO numerosDTO = new NumerosDTO();
        NumerosCTR numerosCTR = new NumerosCTR();
        
        try{
            
            JOptionPane.showMessageDialog(null, "Informe os 3 primeiros números em ordem e o 4 aleatório");
            numerosDTO.setNum1(Integer.parseInt(JOptionPane.showInputDialog("Informe o número 1")));
            numerosDTO.setNum2(Integer.parseInt(JOptionPane.showInputDialog("Informe o número 2")));
            numerosDTO.setNum3(Integer.parseInt(JOptionPane.showInputDialog("Informe o número 3")));
            numerosDTO.setNum4(Integer.parseInt(JOptionPane.showInputDialog("Informe o número 4")));
            
            JOptionPane.showMessageDialog(null, numerosCTR.calcularMaior(numerosDTO));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro " + e.getMessage());
        }
        
    }
    
}
