package ex1;
import java.util.Scanner;

public class Exercicio1 {
		
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o nome do aluno: ");
		String nome = scanner.nextLine();
		System.out.println("\nDigite a nota 1: ");
		int nota1 = scanner.nextInt();
		System.out.println("\nDigite a nota 2: ");
		int nota2 = scanner.nextInt();
		
		int media = (nota1 + nota2) / 2;
		
		boolean conceito;
		
		if(media > 6) {
			System.out.println("\nmedia do aluno é " + media + " Aprovado: ");
			conceito = true;
			return;
		}
		System.out.println("\nmedia do aluno é " + media + " Reprovado: ");
						
	}
}
