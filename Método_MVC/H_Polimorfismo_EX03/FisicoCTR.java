
package H_Polimorfismo_EX03;

public class FisicoCTR {
    
    FisicoDAO fisicoDAO = new FisicoDAO();
    public String mostrarDadosFisico(FisicoDTO fisicoDTO){
        return fisicoDAO.mostrarDadosFisico(fisicoDTO);
    }
}