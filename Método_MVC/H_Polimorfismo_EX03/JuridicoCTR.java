
package H_Polimorfismo_EX03;


public class JuridicoCTR {
     JuridicoDAO juridicoDAO = new JuridicoDAO();
    public String mostrarDadosJuridico(JuridicoDTO juridicoDTO){
        return juridicoDAO.mostrarDadosJuridico(juridicoDTO);
    }
}
   
