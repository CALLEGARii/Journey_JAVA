package Cadastro_Imovel;
import javax.swing.JOptionPane;

public class ImovelVIEW {
    
    public static void main(String[] args){
        
        try{
        
        CasaCTR casaCTR = new CasaCTR();
        CasaDTO casaDTO = new CasaDTO();
        
            JOptionPane.showMessageDialog(null, "Cadastro de Imovel ==== ");
            casaDTO.setCidade(JOptionPane.showInputDialog("Cidade: "));
            casaDTO.setEndereco(JOptionPane.showInputDialog("Endereço: "));
            casaDTO.setBairro(JOptionPane.showInputDialog("Bairro: "));
            casaDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Numero: ")));
            casaDTO.setN_quartos(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Quartos: ")));
            casaDTO.setN_banheiros(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Banheiros: ")));
            casaDTO.setProprietario(JOptionPane.showInputDialog("Nome do Proprietário: "));
        
            
            JOptionPane.showMessageDialog(null, casaCTR.Mostrar_Dados(casaDTO));
        
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Erro no Sistema! " + e.getMessage());
            
        }
        
    }
    
    
}
