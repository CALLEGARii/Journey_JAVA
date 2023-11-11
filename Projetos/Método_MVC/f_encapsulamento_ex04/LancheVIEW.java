package f_encapsulamento_ex04;
import javax.swing.JOptionPane;

public class LancheVIEW {
    
    public static void main(String[] args){
        
        try{
            
        LancheCTR lancheCTR = new LancheCTR();
        LancheDTO lancheDTO = new LancheDTO();
        
        do{
            lancheDTO.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Codigo ------ produto ------- Preço(R$) \n" +
                                                                             "1 -------- Hamburguer ------- R$ 1.50\n " +
                                                                             "2 --------- Cheeseburguer ------- R$ 1.80\n " + 
                                                                             "3 ---------- Misto quente -------- R$ 1.20\n " +
                                                                             "4 ---------- Americano ----------- R$ 2.00\n " +
                                                                             "5 ---------- Queijo Prato ---------- R$ 1.00\n " +
                                                                              "\nDigite o Codigo? ")));
            
            lancheCTR.calculo(lancheDTO);
            
        }while(lancheDTO.getCodigo() !=0);
        
            JOptionPane.showMessageDialog(null, "Total R$" + lancheDTO.getTotal());
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema! " + e.getMessage());
        }
            
      }       
        
    }
   
