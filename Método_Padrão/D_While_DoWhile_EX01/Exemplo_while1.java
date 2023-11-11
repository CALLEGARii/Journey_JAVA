package D_While_DoWhile_EX01;

public class Exemplo_while1 {
    private String letra;
    private int qtde;
    
    public void verificar(String letra){
        this.letra = letra;
        if (this.letra.equalsIgnoreCase("x")){
            this.qtde++;
            
        }
    }
    public int mostra(){
        return this.qtde;
    }
}
