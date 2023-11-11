package Exercicio2;
import javax.swing.JOptionPane;

public class Principal_Nota {
    
    public static void main(String[] args){
        Nota nota = new Nota();
        
      System.out.println("====Programa para Calcular a média e e os pesos das notas ====");
      
      JOptionPane.showMessageDialog(null, nota.calcularMedia(
              Double.parseDouble(JOptionPane.showInputDialog("Informe a primira nota: ")), 
              Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota: ")), 
              Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira nota: ")), 
              Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro peso: ")), 
              Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo peso: ")), 
              Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro peso: "))));
     
         
        
    }
    
}
