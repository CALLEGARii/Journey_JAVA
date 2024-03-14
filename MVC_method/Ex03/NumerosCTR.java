package ex03;

public class NumerosCTR {

    NumerosDAO numerosDAO = new NumerosDAO();
    
    public String calcularMaior(NumerosDTO numerosDTO){
        return numerosDAO.calcularMaior(numerosDTO);
    }
    
}
