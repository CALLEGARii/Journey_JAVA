package ex1;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class insertionSort{
	
	static void sort (int arr[]) {
	int n = arr.length;
	
	for(int i = 1; i< Array.getLength(arr); i++) {
		int chave = arr[i];
		int j = i - 1;
		while(j >= 0 && arr[j] > chave) {
			arr[j + 1] = arr[j];
			j = j - 1;
		}
		arr[j + 1] = chave;
	}	
 }
	
	static void MostrarArray(int arr[]) {
		int n = arr.length;
		for(int i = 0; i < n; i++)
			System.out.println(arr[i] + " ");
		System.out.println();
	}

 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Random random = new Random(); 
	int arr[];
	
	System.out.println("Digite o tamanho do Array: ");
	int tamanho = Integer.parseInt(scanner.next());
	arr = new int[tamanho];
	
	
	for(int z = 0; z< tamanho; z++) {
		arr[z] = random.nextInt(100);
	}
	long tempoInicial = System.currentTimeMillis();
	
	sort(arr);
	MostrarArray(arr);
	
	long tempoFinal   = System.currentTimeMillis();
	long tempoDecorrido = tempoFinal - tempoInicial;
	
	System.out.println("o metodo executou em " + tempoDecorrido + "ms");
	System.out.println("Tempo inicial " + tempoInicial + "ms");
	System.out.println("Tempo final " + tempoFinal + "ms");
	
  } 
 
}
 

  		

 


 

	
	

