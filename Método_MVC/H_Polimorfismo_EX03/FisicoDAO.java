
package H_Polimorfismo_EX03;
 
    public class FisicoDAO extends ClienteDAO{
    public String mostrarDadosFisico(FisicoDTO fisicoDTO){
        
        return mostrarDadosCliente(fisicoDTO) + 
               "\nCPF: " + fisicoDTO.getCpf() + 
               "\nRG: " + fisicoDTO.getRg();
    }
}
    

