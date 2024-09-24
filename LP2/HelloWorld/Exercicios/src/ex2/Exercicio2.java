package ex2;
import java.util.Scanner;

public class Exercicio2 {
	
	public static int calculo(){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite quantos alunos deseja fazer a media: ");
		int aluno = scanner.nextInt();
				
		for(int i = 0; i< aluno; i++) {
			System.out.println("\nDigite o nome do aluno: ");
			String nome = scanner.next();
			System.out.println("\nDigite a nota 1: ");
			int nota1 = scanner.nextInt();
			System.out.println("\nDigite a nota 2: ");
			int nota2 = scanner.nextInt();
				
			int media = (nota1 + nota2) / 2;		
			
			if(media > 6) {
				System.out.println("\nmedia do aluno é " + media + " Aprovado: ");					
			}else {
			System.out.println("\nmedia do aluno é " + media + " Reprovado: ");
			  }
			
			}		
		return 0;
	}
	
	public static void main(String[] args) {		
		calculo();
		
	}

}
