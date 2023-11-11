package Exercicio1_15_08;
import javax.swing.JOptionPane;

public class Cliente1 {
    private String nome, rg;
    
   public void mostrar(String nome, String rg) {
       this.nome = nome;
       this.rg = rg;
       
       
       JOptionPane.showMessageDialog(null, "O nome Informado foi: " + this.nome+
                                           "\nO RG informado foi: " + this.rg);
       
                                           
       
               
   }
    
}
