import java.util.Scanner;

public class Ex_04 {
	
	static Scanner entrada;
	
	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		
		 double paisA = 80000;
		 double paisB = 200000;
		 int ctd = 0;
		 
		 while (paisA <= paisB) {
			 
		paisA += (paisA * 0.03);
		paisB += (paisB * 0.015);
		 ctd += 1;
		 
		 }	
		 
		 System.out.println("A ultrapassa ou iguala a B em "+ ctd + " anos");
		 
		 
		 
		 //parte 2, alterar para o usuario informar
		 
		 float taxaA;
		 float taxaB;
		 
		 System.out.print("Qual a população do pais A? ");
		 paisA = entrada.nextDouble();
		 System.out.print("E qual a sua taxa de crescimento? ");
		 taxaA = entrada.nextFloat();
		 
		 System.out.print("Agora digite a população do pais B: ");
		 paisB = entrada.nextDouble();
		 System.out.print("E qual a sua taxa de crescimento? ");
		 taxaB = entrada.nextFloat();
		 
		 int ctd2 = 0;
		 
		 while (paisA <= paisB) {
			 
		paisA += paisA * (taxaA / 100);
		paisB += paisB * (taxaB / 100);
		ctd2 += 1;
		 
		 }	
		 
		 System.out.println("o país A ultrapassou ou igualou o país B em "+ ctd2+" anos");
	}
}


