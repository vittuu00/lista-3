import java.util.Scanner;

public class Ex_12 {

	static Scanner entrada;
	
		public static void main(String[] args) {
		
			entrada = new Scanner(System.in);
			
			int n;
			int fibonacci = 0;
			int aux = 1;
			
			System.out.print("Digite quantas vezes você quer que sequencia de fibonacci percorra: ");
			n = entrada.nextInt();
			
			for(int k = 0; k < n; k++) {
					fibonacci = fibonacci + aux;
					aux = fibonacci - aux;	
					System.out.print(fibonacci+", ");
				}
			}
			
		}

