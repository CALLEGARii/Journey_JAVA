package Ex04;

public class NumerosCTR {
 
    NumerosDAO numerosDAO = new NumerosDAO();
    
    public void ordenar(NumerosDTO numerosDTO){
        numerosDAO.ordenar(numerosDTO);
    }
    
    public String mostrar(NumerosDTO numerosDTO){
        return numerosDAO.mostrarNumeros(numerosDTO);
    }
    
}
