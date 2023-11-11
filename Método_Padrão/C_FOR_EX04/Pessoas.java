package C_FOR_EX04;
import javax.swing.JOptionPane;

public class Pessoas {
    private double altura_2metros;
    private double altura, altura_soma;
    private String texto;
    
    public void Somar_Alturas(double altura){
        this.altura = altura;
        this.altura_soma += this.altura;
        if(this.altura >2){
            this.altura_2metros++;
          
        }
    }
    private double calcular_altura_Media(){
        return this.altura_soma /20;
        
    }
    public String mostrar_informaçoes(){
        return "A soma das alturas é: " + this.calcular_altura_Media() + 
                "\n quantidade de pessoas com mais de 2 metros é: " + this.altura_2metros;
    }
}