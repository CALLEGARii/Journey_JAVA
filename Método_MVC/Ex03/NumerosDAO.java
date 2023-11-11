package ex03;

public class NumerosDAO {

    public String calcularMaior(NumerosDTO numerosDTO){
        if(numerosDTO.getNum4() > numerosDTO.getNum3()){
             return numerosDTO.getNum4() + " " 
                  + numerosDTO.getNum3() + " " 
                  + numerosDTO.getNum2() + " " 
                  + numerosDTO.getNum1();
        }else if(numerosDTO.getNum4() > numerosDTO.getNum2()){
             return numerosDTO.getNum3() + " " 
                  + numerosDTO.getNum4() + " " 
                  + numerosDTO.getNum2() + " " 
                  + numerosDTO.getNum1();
        }else if(numerosDTO.getNum4() > numerosDTO.getNum1()){
            return numerosDTO.getNum3() + " " 
                 + numerosDTO.getNum2() + " " 
                 + numerosDTO.getNum4() + " " 
                 + numerosDTO.getNum1();
        }else{
            return numerosDTO.getNum3() + " " 
                 + numerosDTO.getNum2() + " " 
                 + numerosDTO.getNum1() + " " 
                 + numerosDTO.getNum4();
        }
    }
    
}
