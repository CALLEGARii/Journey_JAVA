package Cadastro_Aluno;

import javax.swing.JOptionPane;

public class AlunoDAO extends NotasDTO{
    
    public float media=0;
    
    public String Mostrar_Dados(AlunoDTO alunoDTO){
        
            JOptionPane.showMessageDialog(null, "Dados Cadastrados! "
               + "\nNome: " + alunoDTO.getNome()
               + "\nMatricula: " + alunoDTO.getMatricula()
               + "\nNota 1: " + alunoDTO.getNota1()
               + "\nNota 2: " + alunoDTO.getNota2()); 
                  
        media = (alunoDTO.getNota1() + alunoDTO.getNota2())/2;
        
         if(media >=5){
             JOptionPane.showMessageDialog(null, "Aprovado! "); 
             
         }
         else{
             JOptionPane.showMessageDialog(null, "Reprovado! ");
         }
        
       return "Sistema Encerrado! ";
    }
    
    
}
