package IMC_Pessoa;
import javax.swing.JOptionPane;

public class CadastroVIEW {
    
    public static void main(String[] args){
        
        try{
            
            PessoaCTR pessoaCTR = new PessoaCTR();
            PessoaDTO pessoaDTO = new PessoaDTO();
            
            JOptionPane.showMessageDialog(null, "Calcular IMC ====== ");
            pessoaDTO.setNome(JOptionPane.showInputDialog("Nome: "));
            pessoaDTO.setSexo(JOptionPane.showInputDialog("Sexo: "));
            pessoaDTO.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Digite sua Altura: ")));
            pessoaDTO.setPeso(Float.parseFloat(JOptionPane.showInputDialog("Digite seu Peso: ")));
       
            JOptionPane.showMessageDialog(null, pessoaCTR.Mostrar_Dados(pessoaDTO));
            
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Erro no Sistema! " + e.getMessage());
            
        }
               
    }
      
}
