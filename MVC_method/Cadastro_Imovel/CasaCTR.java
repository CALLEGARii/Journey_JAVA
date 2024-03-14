package Cadastro_Imovel;

public class CasaCTR {
    
    CasaDAO casaDAO = new CasaDAO();
    
    public String Mostrar_Dados(CasaDTO casaDTO){
         
        return casaDAO.Mostrar_Dados(casaDTO);   
    }
   
}
