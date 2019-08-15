
import java.util.Scanner;

public class Ex_15 {
	
	static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);
		
		int n = 37, m = 38, nm = 1;
		int soma = 0;
		int TAM = n;
		
		for(int k=0; k < TAM; k++) {
			
			System.out.println(n + "*" + m + "/" + nm);
			
			n--;
			m--;
			nm++;
			soma += (n * m) / nm;
			System.out.println("Valor da soma: " + soma);
		}
		
	}
}
