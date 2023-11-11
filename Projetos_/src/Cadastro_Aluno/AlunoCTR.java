package Cadastro_Aluno;

public class AlunoCTR {
    
    AlunoDAO alunoDAO = new AlunoDAO();
    
    public String Mostrar_Dados(AlunoDTO alunoDTO){
        
        return alunoDAO.Mostrar_Dados(alunoDTO);
        
    }
    
}
