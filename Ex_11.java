import java.util.Scanner;

public class Ex_11 {

	static Scanner entrada;
	
		public static void main(String[] args) {
		
			entrada = new Scanner(System.in);
			
			int n;
			int pares = 0;
			int impares = 0;
			
			for(int k = 0; k < 10; k++) {
				
				System.out.print("Digite um número inteiro: ");
				n = entrada.nextInt();
				
				if (n % 2 == 0)
					pares += 1;
				else
					impares += 1;
			}	
			
			System.out.println("Foi digitado " + pares +" número(s) pare(s)");
			System.out.println("Foi digitado " + impares +" número(s) impar(es)");
			
		}
}
