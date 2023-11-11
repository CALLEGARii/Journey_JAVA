package Exercicio3;

public class Salario {
    private double sal,aumento,salFinal;
    
    
    public double calcularSalario(double sal, double aumento){
        
        salFinal = sal + sal*(aumento/100);
        
        return salFinal;
        
   }
    
}
