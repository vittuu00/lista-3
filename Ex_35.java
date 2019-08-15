import java.text.NumberFormat;
import java.util.Scanner;

public class Ex_35 {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	float cq = (float) 1.20, bs = (float) 1.30, bo = (float) 1.50, hm = (float) 1.20, chs = (float) 1.30, ref = (float) 1.00; 
	int quant1 = 0, quant2 = 0, quant3 = 0, quant4 = 0, quant5 = 0, quant6 = 0;
	
	System.out.println("Bem vindo a nossa lanchonete, aqui está o cardápio!\n");
	System.out.println("Especificação    Código     Preço \nCachorro Quente   100      R$ 1,20\nBauru Simples     101      R$ 1,30\nBauru com ovo     102      R$ 1,50\nHambúrguer        103      R$ 1,20\nCheeseburguer     104      R$ 1,30\nRefrigerante      105      R$ 1,00");
	
	boolean somente = false; 
	
	while(somente == false) {
		
		System.out.println("\nO que o senhor deseja?");
		int pedido = entrada.nextInt();
		
		switch(pedido) {
		
		case(100):
			System.out.println("Cachorro Quente, Quantos?");
			quant1 = entrada.nextInt();
		break;
		case(101):
			System.out.println("Bauru Simples, Quantos?");
			quant2 = entrada.nextInt();
		break;
		case(102):
			System.out.println("Bauru com ovo, Quantos?");
			quant3 = entrada.nextInt();
		break;
		case(103):
			System.out.println("Hambúrguer, Quantos?");
			quant4 = entrada.nextInt();
		break;
		case(104):
			System.out.println("Cheeseburguer, Quantos?");
			quant5 = entrada.nextInt();
		break;
		case(105):
			System.out.println("Refrigerante, Quantos?");
			quant6 = entrada.nextInt();
		break;
		default: 
			System.out.println("Desculpe, estamos em falta");
		}
		
		System.out.println("Mais alguma coisa? Y - N");
		String resposta = entrada.next();
		if("n".equalsIgnoreCase(resposta)) {
			somente = true;
		}
	}
	System.out.println("Já trago o seu pedido!\n\n• • •\n");
	float total = (cq *quant1)+(bs*quant2)+(bo*quant3)+(hm*quant4)+(chs*quant5)+(ref*quant6);
	System.out.println(" Sua conta: "+NumberFormat.getCurrencyInstance().format(total)); 
	
	}
}