package teste;
import javax.swing.JOptionPane;

public class PessoaVIEW {
    
    public static void main(String[] args){
        
        try{
            
            PessoaCTR pessoaCTR = new PessoaCTR();
            PessoaDTO pessoaDTO = new PessoaDTO();
            
            pessoaDTO.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Digite a Altura: ")));
            pessoaDTO.setPeso(Float.parseFloat(JOptionPane.showInputDialog("Digite o Peso: ")));
            
            JOptionPane.showMessageDialog(null, pessoaCTR.calculo(pessoaDTO));
            
        }catch (Exception e){
            
            JOptionPane.showMessageDialog(null, "Erro no Sistema! " + e.getMessage());
        }
        
    }
    
    
}
