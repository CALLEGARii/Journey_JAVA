package EX02;

public class SoloDAO {
    private String resposta;
    
    public String Mostrar(SoloDTO soloDTO){
        
       if((soloDTO.getAgua() >=0) && (soloDTO.getAgua() <=10)){
           this.resposta = "Rochosa: ";
       }else if((soloDTO.getAgua() >10) && (soloDTO.getAgua() <= 40 )){
            this.resposta = "Firme: ";   
        }else if((soloDTO.getAgua() > 40) && (soloDTO.getAgua() <=80)){
            this.resposta = "Pantanoso: ";
        }else{
            this.resposta = "Quantidade de agua invalido: ";
        }
       
        return this.resposta;
    }
    
}
