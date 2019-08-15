import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex_27 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float preco = 1;
		float total = 0;
		int cont = 1;
		
		System.out.println("\nLojas Tabajara");
		
		DecimalFormat df = new DecimalFormat("#0.00");
		
		while(preco != 0) {;
			System.out.print("Produto "+cont+": R$ ");
			preco = entrada.nextFloat();
			
			if (cont == 1) { 
				total = preco;
			} else 
				total = total +preco;
			cont++;		
		}
		
		System.out.println("Total: "+df.format(total));
		
		float pag = 0;
		
		System.out.print("Pagamento: ");
		pag = entrada.nextFloat();
	
		float troco = pag - total;
		
		if(pag == 0) {
			System.out.println("Cade meu dinheiro caralho");
		}else if (pag == total){
			System.out.printf("Sem troco");
		}else {
			System.out.println("Troco: "+troco);
		}		
		
		entrada.close();

	}
}