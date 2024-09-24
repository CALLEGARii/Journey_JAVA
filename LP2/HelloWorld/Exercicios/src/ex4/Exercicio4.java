package ex4;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.*;

	public class Exercicio4 {
		
		 public static void calculo(String fileCSV, String fileCSV1){
		        try{
		            BufferedReader br = new BufferedReader(new FileReader(new File(fileCSV)));
		            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(fileCSV1)));
		            System.out.println("File open successful!");
		            String linha;
		            
		            while((linha = br.readLine()) != null) {
		            	String[] dados = linha.split(",");
		            	
		            	
		            	String nome = dados[0].trim();
		            	float nota1 = Float.parseFloat(dados[1].trim());
		            	float nota2 = Float.parseFloat(dados[2].trim());
		            	
		            	float media = (nota1 + nota2) / 2;
		            	
		            	if(media > 6) {
		    				System.out.println("\nO aluno " + nome + " media do aluno é " + media + " Aprovado: ");					
		    			}else {
		    			System.out.println("\nO aluno " + nome + " media do aluno é " + media + " Reprovado: ");
		    			  }
		            }  

	            }catch(Exception e){
	            System.out.println("Deu erro aqui " + e.getMessage());
	            }

		    }
		 public static void main(String[] args) {
			 String fileCSV = "/home/veterano/Área de Trabalho/LP2/HelloWorld/Exercicios/src/ex3/file.csv";
			 String fileCSV1 = "/home/veterano/Área de Trabalho/LP2/HelloWorld/Exercicios/src/ex3/file.csv";
			 calculo(fileCSV,fileCSV1);
			 
		 }
		
	}
	


