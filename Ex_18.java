import java.util.Scanner;

public class Ex_18 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		System.out.print("Informe um n�mero: ");
		num = entrada.nextInt();
		
		int cont = 0;
		
		if (num == 1) {
			System.out.print("Este n�mero n�o � primo");
		}else {
			for (int i = 2; i < num; i++ ) {
				if (num % i == 0) {
					cont++;
					System.out.println("Divisivel por: "+i);
				}
			}
		
			if	(cont == 0) {
				System.out.println("Este n�mero � primo");
			}else 
				System.out.println("Este n�mero n�o � primo");
		}
			entrada.close();
	}	
	}
