package Ex04;

public class NumerosDAO {
    int[] numeros;
    public void ordenar(NumerosDTO numerosDTO){
        int temp;
        numeros = numerosDTO.buscaNumeros();
        for(int i = 2; i >= 1; i--){
            for(int j=0; j<i; j++){
                if(numeros[j] > numeros[j+1]){
                    temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                }
            }
        }
    }
    
    public String mostrarNumeros(NumerosDTO numerosDTO){
        ordenar(numerosDTO);
        return numeros[0] + " " + numeros[1] + " " + numeros[2];
    }
    
}
