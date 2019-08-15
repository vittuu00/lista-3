import java.util.Scanner;

public class Ex_01 {
	
	static Scanner entrada;
	
	public static void main(String[] args) {
	
		entrada = new Scanner(System.in);

	
		boolean ok = true;
		int n;
		
		while (ok) {
			System.out.print("Digite um numero entre ZERO e DEZ: ");
			n = entrada.nextInt();
			if(n >= 0 && n <= 10) {
				System.out.println("valor valido");
				ok = false;
			}else 
				System.out.println("valor invalido, digite de novo" );
		}
	}
}
