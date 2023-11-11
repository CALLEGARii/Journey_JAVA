package C_FOR_EX01;
import Exercicio1_15_08.Cliente1;
import javax.swing.JOptionPane;

public class PrincipalTabuada {
    
    public static void main(String[] args){
       Tabuada tabuada = new Tabuada();
       JOptionPane.showMessageDialog(null,"Vamos ao teste para a tabuada: ");
       JOptionPane.showMessageDialog(null, tabuada.calcular_Tabuada(Integer.parseInt(JOptionPane.showInputDialog("Digite o número para fazer a tabuada: "))));
       JOptionPane.showMessageDialog(null,"Parabens, Obrigado por participar: ");
    }
    
}
