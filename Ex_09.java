import java.util.Scanner;

public class Ex_09 {
	
	static Scanner entrada;
	
	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
	
	
	
			int n1 = 0;
			boolean ok = true;
		
			 while (ok) {
			 System.out.print("Digite um número inteiro entre 1 e 10: ");
			 n1 = entrada.nextInt();
			 
			 if (n1 >= 1 && n1 <= 10)
				 ok = false;
			 else
				 System.out.println("número invalido");
			 }
			 
			 System.out.println("Tabuada do número: " + n1);
			 
			 for (int k = 0; k < 10; k++) {
				
				 System.out.println(n1 + " x " + (k + 1) + " = "+ ((k + 1) * n1));
				 
			 } 
	}
}
