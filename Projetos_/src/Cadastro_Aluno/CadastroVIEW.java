package Cadastro_Aluno;
import javax.swing.JOptionPane;

public class CadastroVIEW {
    
    public static void main(String[] args){
        
        try{
            
            AlunoCTR alunoCTR = new AlunoCTR();
            AlunoDTO alunoDTO = new AlunoDTO();
            
            
            JOptionPane.showMessageDialog(null, "Cadastro de Alunos ===== ");
            alunoDTO.setNome(JOptionPane.showInputDialog("Nome: "));
            alunoDTO.setSexo(JOptionPane.showInputDialog("Sexo: "));
            alunoDTO.setMatricula(Double.parseDouble(JOptionPane.showInputDialog("Matricula: ")));
            alunoDTO.setNota1(Integer.parseInt(JOptionPane.showInputDialog("Nota 1: ")));
            alunoDTO.setNota2(Integer.parseInt(JOptionPane.showInputDialog("Nota 2: ")));
            
            JOptionPane.showMessageDialog(null, alunoCTR.Mostrar_Dados(alunoDTO));
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Erro no Sistema! " + e.getMessage());
              
        }
      
    }
  
}
