package H_Polimorfismo_EX02;
import javafx.application.ConditionalFeature;
import javax.swing.JOptionPane;

public class AlunoVIEW {
    
    public static void main(String[] args){
        
        AlunoDTO alunoDTO = new AlunoDTO();
        AlunoCTR alunoCTR = new AlunoCTR();
        
        alunoDTO.setNome(JOptionPane.showInputDialog("Informe o Nome: "));
        alunoDTO.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: ")));
        alunoDTO.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2: ")));
        alunoDTO.setN3(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3: ")));
        alunoDTO.setN4(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 4: ")));
          
        alunoDTO.setOpcao(Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao 1, 2 ou 3 ")));
        
        alunoCTR.mostrar(alunoDTO);
        JOptionPane.showMessageDialog(null, alunoCTR.imprimir(alunoDTO));
        
        
    }
       
}
