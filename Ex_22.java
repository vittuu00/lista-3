import java.util.Scanner;

public class Ex_22 {
	
	static Scanner entrada;
	
	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		int TAM;
		int candidato1 = 0;
		int candidato2 = 0;
		int candidato3 = 0;
		
		System.out.print("Quantos votantes são? ");
		TAM = entrada.nextInt();
		
		for (int k=0; k<TAM; k++) {
			boolean ok = true;
			while (ok) {
			System.out.println("1- candidato 1");
			System.out.println("2- candidato 2");
			System.out.println("3- canditato 3");
			System.out.print("Digite o numero respectivo a quem você quer votar: ");
			int voto = entrada.nextInt();
			
			if (voto == 1) { 
				candidato1++;
				ok = false;
			}
			
			if (voto == 2) { 
				candidato2++;
				ok = false;
			}
			if (voto == 3){
				candidato3++;
				ok = false;
			}
			if (voto > 3 || voto <= 0)
				System.out.println("opção invalida");
			}	
		}
		
			System.out.println("Votos para o candidato 1 \n -> "+ candidato1);
			System.out.println("Votos para o candidato 2 \n -> "+ candidato2);
			System.out.println("Votos para o candidato 3 \n -> "+ candidato3);
			
			entrada.close();
	}
}
