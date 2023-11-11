package Exercicio2;
import javax.swing.JOptionPane;

public class Nota {
    private double n1,n2,n3,media;  
            int p1,p2,p3;
             
 public double calcularMedia (double n1, double n2, double n3, int p1, int p2, int p3){
 this.n1 = n1;
 this.n2 = n2;
 this.n3 = n3;
 this.p1 = p1;
 this.p2 = p2;
 this.p3 = p3;
 
     this.media = ((this.n1 * this.p1) + (this.n2 * this.p2) + (this.n3 * this.p3))/(this.p1 + this.p2 + this.p3);
     
      return this.media;                
  }
   
}



     


   