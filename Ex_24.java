import java.util.Scanner;

public class Ex_24 {
	
	static Scanner entrada;
	
	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		int QTD;
		float valor = 0;
		int valorTotal = 0;
		
		System.out.print("Quantos CDs s�o? ");
		QTD = entrada.nextInt();
		
		for (int k = 0; k < QTD; k++) {
		
				System.out.print("Qual o valor do "+ (k+1)+"� CD? ");
				valor = entrada.nextFloat();

				valorTotal += valor;
				
				}
		
			float media = valorTotal/QTD;
			
		System.out.print("\nO valor m�dio do pre�o dos CDs �: "+ (media));
		System.out.print("\nO valor total investido nos CDs �: "+ (valorTotal));
		
		
		entrada.close();
	}
}
