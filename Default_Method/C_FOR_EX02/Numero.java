package C_FOR_EX02;
import javax.swing.JOptionPane;

public class Numero {
    private int n1,n2;
    private String imprimir = "";
    public String Numero_Sequencial(int n1 ,int n2){
        this.n1 = n1;
        this.n2 = n2;
      for(int cont = this.n1; cont<= this.n2; cont++){
          this.imprimir += cont + "  ";
        }
          return this.imprimir;  
      }
    
}
