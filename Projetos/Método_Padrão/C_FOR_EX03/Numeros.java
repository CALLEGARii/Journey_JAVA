package C_FOR_EX03;
import javax.swing.JOptionPane;

public class Numeros {
    private int numeros, soma;
    public void Soma_Numeros(int numeros){
        this.numeros = numeros;
        this.soma += this.numeros;
    }
    public int mostra_Soma(){
        return this.soma;
    }
  
}
