
package H_Polimorfismo_EX03;
import javax.swing.JOptionPane;

public class ClienteVIEW {
    
    public static void main(String[] args){
        
        try{
            
        JuridicoDTO juridicoDTO = new JuridicoDTO();
        JuridicoCTR juridicoCTR = new JuridicoCTR();
        
        JOptionPane.showMessageDialog(null, "Trabalhando com o Objeto Juridico.");
        juridicoDTO.setNome(JOptionPane.showInputDialog("Nome: "));
        juridicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Telefone: ")));
        juridicoDTO.setEstado(JOptionPane.showInputDialog("Estado: "));
        juridicoDTO.setCidade(JOptionPane.showInputDialog("Cidade: "));
        juridicoDTO.setEndereço(JOptionPane.showInputDialog("Endereço: "));
        juridicoDTO.setCnpj(JOptionPane.showInputDialog("CNPJ: "));
        juridicoDTO.setIe(JOptionPane.showInputDialog("Inscrição Estadual: "));
        
        JOptionPane.showMessageDialog(null, juridicoCTR.mostrarDadosJuridico(juridicoDTO));
        
        FisicoDTO fisicoDTO = new FisicoDTO();
        FisicoCTR fisicoCTR = new FisicoCTR();
        
        JOptionPane.showMessageDialog(null, "Trabalhando com o Objeto Fisico.");
        fisicoDTO.setNome(JOptionPane.showInputDialog("Nome: "));
        fisicoDTO.setCpf(JOptionPane.showInputDialog("CPF: "));
        fisicoDTO.setRg(JOptionPane.showInputDialog("RG: "));
        fisicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Telefone: ")));
        fisicoDTO.setEstado(JOptionPane.showInputDialog("Estado: "));
        fisicoDTO.setCidade(JOptionPane.showInputDialog("Cidade: "));
        fisicoDTO.setEndereço(JOptionPane.showInputDialog("Endereço: "));
        
        JOptionPane.showMessageDialog(null, fisicoCTR.mostrarDadosFisico(fisicoDTO));
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e.getMessage());
        }
        
    }
    
}