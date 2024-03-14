package exercicio1_while;

public class Alfabeto {
    private String letra, resposta;
    private int A, E , I , O , U, consoante;
    
    public void verificar_Letra(String letra){
        this.letra = letra;
        if (this.letra.equalsIgnoreCase("a")){
              A++;
        }else if (this.letra.equalsIgnoreCase("e")){
              E++;      
        }else if (this.letra.equalsIgnoreCase("i")){
              I++;
        }else if (this.letra.equalsIgnoreCase("o")){
              O++;         
        }else if (this.letra.equalsIgnoreCase("u")){
              U++;
        }else
            consoante++;       
    }

    public String Mostrar(){
        resposta = "Foram digitadas: " + 
                this.A + "Letras A\nForam digitadas: " + 
                this.E + "Letras E\nForam Digitadas: " + 
                this.I + "Letras I\nForam digitadas: " + 
                this.O + "Letras O\nForam digitadas: " + 
                this.U + "Letras U\nForam Digitadas: " + 
                (consoante - 1);
           return resposta;
        
    }
    
}
