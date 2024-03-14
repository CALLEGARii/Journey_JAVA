package IMC_Pessoa;

public class ImcDTO implements IImcDTO{
    
    private float altura;
    private float peso;

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
}
