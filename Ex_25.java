import java.util.Scanner;

public class Ex_25 {

	static Scanner entrada;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		entrada = new Scanner(System.in);
		
		int QTD = 0;
		double VALOR = 1.99;
		boolean ok = true;
		double valorTotal = 0;
		
		while (ok) {
			
		System.out.print("Quantos produtos são? ");
		QTD = entrada.nextInt();
		
			if (QTD <= 50)
				ok = false;
			else
				System.out.println("quantidade de produtos ultrapassado, no máximo 50!");
		}
		
		for (int k=0; k<QTD;k++) {
			
			if (k == 0)
				valorTotal = VALOR;
			else
				valorTotal += VALOR;

		}
		
		System.out.println("O valor total é: "+ valorTotal);
		
		entrada.close();
		
	}
}
