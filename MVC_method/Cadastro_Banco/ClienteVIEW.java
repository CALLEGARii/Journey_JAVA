package Cadastro_Banco;

import javax.swing.JOptionPane;


public class ClienteVIEW {
    
    public static void main(String[] args){
        
        try{
           
            BancoCTR bancoCTR = new BancoCTR();
            BancoDTO bancoDTO = new BancoDTO();
            
            JOptionPane.showMessageDialog(null, "----- Banco Digital ----- ");
            bancoDTO.setNome(JOptionPane.showInputDialog("Digite seu Nome "));
            bancoDTO.setSexo(JOptionPane.showInputDialog("Sexo "));
            bancoDTO.setCpf(Integer.parseInt(JOptionPane.showInputDialog("Digite seu CPF ")));
            
            bancoCTR.Mostrar_Dados(bancoDTO);
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Erro no Sistema! " + e.getMessage());
        }
        
        
    }
    
    
}
