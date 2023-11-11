package f_encapsulamento_ex02;
import javax.swing.JOptionPane;

public class FuncionarioVIEW {
    public static void main(String args[]){
        
        FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
        FuncionarioCTR funcionarioCTR = new FuncionarioCTR();
        
        funcionarioDTO.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo ")));
        funcionarioDTO.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o Telefone ")));
        
        
        
    }
    
    
}
