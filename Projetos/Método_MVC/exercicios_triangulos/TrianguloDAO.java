package exercicios_triangulos;

public class TrianguloDAO {

    public boolean verificarTriangulo(TrianguloDTO trianguloDTO){
        if((trianguloDTO.getLadoA() + trianguloDTO.getLadoB()) > trianguloDTO.getLadoC() &&
                ((trianguloDTO.getLadoA() + trianguloDTO.getLadoC()) > trianguloDTO.getLadoB()) &&
                ((trianguloDTO.getLadoB() + trianguloDTO.getLadoC()) > trianguloDTO.getLadoA())){
        return true;
        }else{
            return false;
        }
    }
    
    public String classificarTriangulo(TrianguloDTO trianguloDTO){
        if(verificarTriangulo(trianguloDTO)){
            
        }
        return String.valueOf(0);
    }
   
    
}
