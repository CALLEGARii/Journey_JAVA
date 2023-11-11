package EX02;

public class SoloCTR {
    SoloDAO soloDAO = new SoloDAO();
    
    public String calcular(SoloDTO soloDTO){
        return soloDAO.Mostrar(soloDTO);
        
    }
    
}
