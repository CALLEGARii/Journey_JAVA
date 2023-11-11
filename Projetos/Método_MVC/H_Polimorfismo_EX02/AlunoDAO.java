
package H_Polimorfismo_EX02;

public class AlunoDAO {
    private double media;
    
   public void calcularMedia(AlunoDTO alunoDTO){
       
       switch(alunoDTO.getOpcao()){
           
           case 1:
               calcularMedia(alunoDTO.getN1(), alunoDTO.getN2());
               break;
           case 2:
               calcularMedia(alunoDTO.getN1(), alunoDTO.getN2(),alunoDTO.getN3());
               break;          
           case 3:
               calcularMedia(alunoDTO.getN1(), alunoDTO.getN2(), alunoDTO.getN3(), alunoDTO.getN4());
               break;
           default:
               System.out.println("Opcao invalida:");
               break;
       }
    
      
   }
   
    public void calcularMedia(double n1, double n2){
       
       this.media = (n1 + n2) / 2;
   }
   
    public void calcularMedia(double n1, double n2, double n3){
       
       this.media = (n1 + n2 + n3) / 3;
       
   }
   
    public void calcularMedia(double n1, double n2, double n3, double n4){
       
       this.media = (n1 + n2 + n3 + n4) / 4;
       
   }
    public String imprimir(){
        
        return "A média é " +  this.media;
    }
   
}
