package J_Vetor_EX02;
import javax.swing.JOptionPane;

public class AlgoritmoVIEW {
    
    public static void main(String[] args){
        
        try{
            
            int num[] = new int[20];
            
            AlgoritmoCTR algoritmoCTR = new AlgoritmoCTR();
            AlgoritmoDTO algoritmoDTO = new AlgoritmoDTO();
          
            for(int cont=0; cont<20; cont++){
                
                num[cont] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: " + cont));  
            }
            
            algoritmoDTO.setVetor(num);
            JOptionPane.showMessageDialog(null, algoritmoCTR.Mostrar_Dados(algoritmoDTO));
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Erro no Sistema! " + e.getMessage());
            
        }
        
    }
    
}
