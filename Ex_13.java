import java.util.Scanner;

public class Ex_13 {

	static Scanner entrada;
	
		public static void main(String[] args) {
		
			entrada = new Scanner(System.in);
			
			int n;
			int fatorial = 0;
			
			System.out.print("Digite um número: ");
			n = entrada.nextInt();
			fatorial = n;
			for(int k = 0; k < n; k++) {
				
				n -= 1;
				fatorial = n * fatorial ; 
				
				}
			System.out.print("Seu fatorial é: "+ fatorial);
			}
			
		}

