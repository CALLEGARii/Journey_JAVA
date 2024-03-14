package f_encapsulamento_ex03;

import f_encapsulamento_ex02.FuncionarioDTO;

public class PessoaDAO {
       
    public String calculo(PessoaDTO pessoaDTO){
        String messagem;
        
        if(pessoaDTO.getAltura() <= 1.20 && pessoaDTO.getPeso() <60){
                messagem = "Classificação A: ";
        }
        else if(pessoaDTO.getAltura() >= 1.20 && pessoaDTO.getAltura() <=1.70 && pessoaDTO.getPeso() <60){
            messagem = "Classificação B: ";
        }
        else if(pessoaDTO.getAltura() >=1.70 && pessoaDTO.getPeso() <60){
            messagem = "Classificação C: ";   
        }
        else if(pessoaDTO.getAltura() < 1.20 && pessoaDTO.getPeso() >=60 && pessoaDTO.getPeso() <=90){
            messagem = "Classificação D: ";
        }
        else if(pessoaDTO.getAltura() >=1.20 && pessoaDTO.getAltura() <=1.70 && pessoaDTO.getPeso() >=60 && pessoaDTO.getPeso() <=90){
            messagem = "Classificação E: ";
        }
        else if(pessoaDTO.getAltura() <=1.70 && pessoaDTO.getPeso() >=60 && pessoaDTO.getPeso() <=90){
            messagem = "Classificação F: "; 
        }
        else if(pessoaDTO.getAltura() >=1.20 && pessoaDTO.getPeso() >=90){
            messagem = "Classificação G: ";
        }
        else if(pessoaDTO.getAltura() >=1.20 && pessoaDTO.getAltura() <=1.70 && pessoaDTO.getPeso() >=90){
            messagem = "Classificação H: "; 
        }
        else{
            messagem = "Classificação I: ";
        }
        
      return messagem;  
    }
    
   
    
}
