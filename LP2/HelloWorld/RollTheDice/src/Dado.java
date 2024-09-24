import java.util.Scanner;
import java.util.Random; 
import java.util.*; 

public class Dado {

	public static void main(String[] args) {
		Scanner snr = new Scanner(System.in);
		Random random = new Random();
		int n = 3;
		double[] pontuacaoJogador1 = new double[n], pontuacaoJogador2 = new double[n];
		double somaTotalJogador1 = 0, somaTotalJogador2 = 0;

		boolean doisValoresIguaisJogador1 = false;
		boolean doisValoresIguaisJogador2 = false;
		
		boolean tresValoresIguaisJogador1 = false;
		boolean tresValoresIguaisJogador2 = false;
		
		System.out.print("Digite o nome do Jogador 1: ");
		String jogador1 = snr.next();
		
		System.out.print("Digite o nome do Jogador 2: ");
		String jogador2 = snr.next();
		
		for(int i = 0; i < 3; i++) {
			pontuacaoJogador1[i] = random.nextInt(6)+1;
			pontuacaoJogador2[i] = random.nextInt(6)+1;

			somaTotalJogador1 += pontuacaoJogador1[i];
			somaTotalJogador2 += pontuacaoJogador2[i];
		}
		
		for(int j = 0; j < 2; j++) {
			for(int k = 1; k < 3; k++) {
				if(j == k) {
					if(pontuacaoJogador1[j] == pontuacaoJogador1[k]) {
						doisValoresIguaisJogador1 = true;
					}
					
					if(pontuacaoJogador2[j] == pontuacaoJogador2[k]) {
						doisValoresIguaisJogador2 = true;
					}
					
					if(pontuacaoJogador1[j] != pontuacaoJogador1[k]) {
						tresValoresIguaisJogador1 = true;
					}
					
					if(pontuacaoJogador2[j] != pontuacaoJogador2[k]) {
						tresValoresIguaisJogador2 = true;
					}
				}
			}
		}
		
		if(tresValoresIguaisJogador1) {
			somaTotalJogador1 *= 3;
		}else if(doisValoresIguaisJogador1){
			somaTotalJogador1 *= 2;
		}
		
		if(tresValoresIguaisJogador2) {
			somaTotalJogador2 *= 3;
		}else if(doisValoresIguaisJogador2){
			somaTotalJogador2 *= 2;
		}
		
		
		System.out.println(jogador1 + " fez " + somaTotalJogador1 + " pontos");
		System.out.println("dado1 = " + pontuacaoJogador1[0] + " dado2 = " + pontuacaoJogador1[1]
					+ " dado3 = " + pontuacaoJogador1[2]);
		
		System.out.println(jogador2 + " fez " + somaTotalJogador2 + " pontos");
		System.out.println("dado1 = " + pontuacaoJogador2[0] + " dado2 = " + pontuacaoJogador2[1]
					+ " dado3 = " + pontuacaoJogador2[2]);
		
		if(somaTotalJogador1 > somaTotalJogador2) {
			System.out.println("Jogador 1 " + jogador1 + " ganhou.");
			return;
		}
		
		System.out.println("Jogador 2 " + jogador2 + " ganhou.");
	}

}
