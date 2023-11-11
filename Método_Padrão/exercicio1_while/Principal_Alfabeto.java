package exercicio1_while;
import javax.swing.JOptionPane;

public class Principal_Alfabeto {
    public static void main(String[] args){
        String letra;
        
        Alfabeto Objeto = new Alfabeto();
        do{
            letra = JOptionPane.showInputDialog("Digite uma letra: ");
            Objeto.verificar_Letra(letra);
            
        }while (!letra.equals("0"));
       
        JOptionPane.showMessageDialog(null, Objeto.Mostrar());
    }
    
}
