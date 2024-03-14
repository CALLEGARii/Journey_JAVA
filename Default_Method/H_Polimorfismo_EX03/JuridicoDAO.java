package H_Polimorfismo_EX03;

public class JuridicoDAO extends ClienteDAO{
    public String mostrarDadosJuridico(JuridicoDTO juridicoDTO){
        
        return mostrarDadosCliente(juridicoDTO) + 
               "\nCPNJ: " + juridicoDTO.getCnpj() +
               "\nI.E: " + juridicoDTO.getIe();
    }
}