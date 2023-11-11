package J_Vetor_EX01;
import javax.swing.JOptionPane;

public class NumeroVIEW {
    
    public static void main(String[] args){
        
       try{
           
           int num[] = new int[5];
           
           NumeroCTR numeroCTR = new NumeroCTR();
           NumeroDTO numeroDTO = new NumeroDTO();
                   
                   for(int cont=0; cont<5; cont++){
                       
                    num[cont] =  Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: " + cont));   
                   }
                   
                   numeroDTO.setVetor(num);
                   JOptionPane.showMessageDialog(null, numeroCTR.Mostrar_Dados(numeroDTO));
               
       }catch(Exception e){
           
           JOptionPane.showMessageDialog(null, "Erro no Sistema! " + e.getMessage());
       }    
    }   
}
