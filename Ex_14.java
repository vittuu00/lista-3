
import java.util.Scanner;

public class Ex_14 {
	
	static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);
		
		int TAM;
		int n = 1, m = 1;
		
		System.out.print("Qual o tamanho desse conjunto de números? ");
		TAM = entrada.nextInt();
		
		for(int k=0; k < TAM; k++) {
			
			System.out.println(n + "/" + m);

			n ++;
			m += 2;
			
		}
		
	}
}
