package H_Polimorfismo_EX02;

public class AlunoCTR {
    
   AlunoDAO alunoDAO = new AlunoDAO();
   
   public void mostrar(AlunoDTO alunoDTO){
       
       alunoDAO.calcularMedia(alunoDTO);
   }
   
   public String imprimir(AlunoDTO alunoDTO){
       
       return alunoDAO.imprimir();
   }
    
}
