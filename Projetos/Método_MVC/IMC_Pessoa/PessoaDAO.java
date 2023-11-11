package IMC_Pessoa;

public class PessoaDAO implements IPessoaDAO{
    
    public String mensagem;
    public float imc;
  
    public String Mostrar_Dados(PessoaDTO pessoaDTO){
       
        imc = (pessoaDTO.getPeso()) / (pessoaDTO.getAltura() * pessoaDTO.getAltura());
        
       mensagem = " Cadastro Concluído --------- "
               + "\nNome: " + pessoaDTO.getNome()
               + "\nSexo: " + pessoaDTO.getSexo()
               + "\nCPF: " + pessoaDTO.getCpf()
               + "\nAltura: " + pessoaDTO.getAltura()
               + "\nPeso: " + pessoaDTO.getPeso();
         
         return "Seu IMC é ==== " + imc;      
    }
    
}
