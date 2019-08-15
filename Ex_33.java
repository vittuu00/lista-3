import java.text.NumberFormat;

import java.util.Scanner;

public class Ex_33 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		float parcela = 0;
		int juros = 0;
		
		System.out.print("Qual o valor da sua divida: ");
		float divida = entrada.nextFloat();
		
		System.out.println("Você pode parcelar sua divida em até 3x sem juros\n");
		
	System.out.println("Valor da Dívida   Valor dos Juros   Quantidade de Parcelas   Valor da Parcela\n");
	for(int i = 1;i <= 12;i++) {
		System.out.print(" "+NumberFormat.getCurrencyInstance().format(divida));
		System.out.print("            "+juros+"         ");
		System.out.print("             "+i+"       ");
		parcela = divida / i;
		System.out.println("      "+NumberFormat.getCurrencyInstance().format(parcela));
		
		if(i == 3) {
			juros = (int) (divida * 0.1);
		}else if ((i == 6) || (i == 9) || (i == 12)) {
			juros = (int) (divida * 0.15); 
			divida = divida + juros;
	}
	}
}
}