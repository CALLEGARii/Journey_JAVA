package C_FOR_EX02;
import javax.swing.JOptionPane;

public class PrincipalNumero {
    public static void main(String[] args){
        Numero numero = new Numero();
          JOptionPane.showMessageDialog(null,"Vamos ao teste do numero sequencial: ");
          JOptionPane.showMessageDialog(null,numero.Numero_Sequencial(
                  Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero:")),
                  Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero:"))
                  ));
    }
    
}
