package Cadastro_Banco;

public class BancoCTR {
    
    BancoDAO bancoDAO = new BancoDAO();
    
    public String Mostrar_Dados(BancoDTO bancoDTO){
        
       return bancoDAO.Mostrar_Dados(bancoDTO);
        
    }
 
}
