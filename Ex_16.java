
import java.util.Scanner;

public class Ex_16 {
	
	static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);
		
		float menor = 0, soma = 0, n, maior = 0;
		int TAM;

		
		System.out.print("Qual o tamanho desse conjunto de números? ");
		TAM = entrada.nextInt();
		
		for(int k=0; k < TAM; k++) {
		
			System.out.print("\nDigite um número: ");
			n = entrada.nextFloat();
			
			soma += n;
			
			if (k == 0)
				menor = n;
			else if (menor > n)
				menor = n;
			
			if (maior < n)
				maior = n;
		}
		
		System.out.println("A soma dos números é: "+ soma);
		System.out.println("O menor dos números é: "+ menor);
		System.out.println("O maior dos números é: "+ maior);
	}
}
