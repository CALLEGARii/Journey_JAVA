package D_While_DoWhile_EX01;
import javax.swing.JOptionPane;

public class Principal_Exemplowhile1 {
    public static void main(String[] args){
        String letra = "x";
        Exemplo_while1 exemplowhile1 = new Exemplo_while1();
        
        while(letra.equalsIgnoreCase("x")){
            letra = JOptionPane.showInputDialog("Informe a letra");
            exemplowhile1.verificar(letra);
            
        }
        JOptionPane.showMessageDialog(null,"A quantidade de vezes que x foi digitado é: " + exemplowhile1.mostra());
    }
    
}
