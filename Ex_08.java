import java.util.Scanner;

public class Ex_08 {
	
	static Scanner entrada;
	
	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
	
	
			int soma = 0;
			int n1;
			int n2;
			 
			 System.out.print("Digite um n�mero inteiro: ");
			 n1 = entrada.nextInt();
			 System.out.print("Digite mais um n�mero inteiro ");
			 n2= entrada.nextInt();
			 
			 System.out.println("Os n�meros inteiros que est�o no intervalo compreendido por eles s�o:");
			 
			 if (n1 > n2) {
				 while( n2 != (n1 -1)) {
					 n2 += 1;
					 soma += n2;
					 System.out.print(n2+", ");
				 }
				 
			 }else {
				 while( n1 != (n2 -1)) {
					 n1 += 1;
					 soma += n1;	
					 System.out.print(n1+", ");
				 } 
			 }
			 
			 System.out.println("\nA soma dos n�meros que est�o no intervalo compreendido por eles �: "+ soma);

	}
}
