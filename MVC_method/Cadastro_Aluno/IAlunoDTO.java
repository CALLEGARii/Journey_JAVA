package Cadastro_Aluno;

public interface IAlunoDTO{
    
    void setNome(String nome);
    void setSexo(String sexo);
    void setMatricula(double matricula);
   
    String getNome();
    String getSexo();
    double getMatricula();
    
}
