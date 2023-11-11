package f_encapsulamento_ex04;

public class LancheDAO {
    
    public void calculo(LancheDTO lancheDTO){
        
        float total = lancheDTO.getTotal();
        
        switch(lancheDTO.getCodigo()){
            
            case 1:
                total += 1.5;
                break;
            case 2:    
                total += 1.8;
                break;
            case 3:
                total += 1.2;
                break;
            case 4:
                total += 2.0;
                break;
            case 5:
                total += 1.0;
                break;
            case 0:
                break;
            
        }
        
       lancheDTO.setTotal(total);
    }
    
    
}
