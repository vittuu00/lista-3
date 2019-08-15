import java.util.Scanner;

public class Ex_10 {
	
	static Scanner entrada;
	
	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
	
	
	
			float n1;
			float n2;
			float resultado; 
			 
			 System.out.print("Digite um número para ser a base: ");
			 n1 = entrada.nextFloat();
			 System.out.print("Digite mais um número para ser o expoente ");
			 n2= entrada.nextFloat();
			 
			 resultado = n1;
			 
			for(int k = 0; k < (n2 - 1); k++) {
				
				resultado = resultado * n1;
			}
			 	 
			System.out.println(resultado);

	}
}
