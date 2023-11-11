package Exercicio3;
import javax.swing.JOptionPane;

public class Principal_Salario {
    public static void main(String[] args){
        Salario salario = new Salario();
        
        
        
        JOptionPane.showMessageDialog(null," O salario é:" + 
                salario.calcularSalario(
                        Double.parseDouble(JOptionPane.showInputDialog("Infome o Salario: ")),
                        Double.parseDouble(JOptionPane.showInputDialog("Iforme a porcentagem: "))
                
                
                ));
        
    }
    
}
