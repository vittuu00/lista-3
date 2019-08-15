import java.util.Scanner;

public class Ex_32 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		boolean f1 = true;
		String codcity = " ", codmaior = " ", codmenor = " ";
		
		float  mediamaior = 0, mediamenor = 0,mediacars = 0, mediafloat = 0;
		float media = 0;
		
		for(int i = 0; i <4;i++) {
			
			System.out.print("\nCodigo da cidade:");
			codcity = entrada.next();
			
			System.out.print("\nNúmero de veículos de passeio (em 1999):");
			float veicpasseio = entrada.nextFloat();
			
			System.out.print("\nNúmero de acidentes de trânsito com vítimas (em 1999):");
			float acidentes = entrada.nextFloat();
			
			media =  100 * (acidentes / veicpasseio);
			
			if(f1 == true) {
				mediamaior = (int) media;
				mediamenor = (int) media;
				f1 = false;
			}
			
			if(media > mediamaior) {
				mediamaior =  media;
				codmaior = codcity;
			}else if(media < mediamenor) {
				mediamenor =  media;
				codmenor = codcity;
			}
			
			mediacars = mediacars + veicpasseio;
			
			if(veicpasseio <= 2000) {
				mediafloat = mediafloat + media; 
			}	
		}
		
		mediacars = mediacars / 5;
		System.out.println("\nMaior índice de acidentes: "+mediamaior+"%, na Cidade "+codmaior);
		System.out.println("Menor índice de acidentes: "+mediamenor+"%, na Cidade "+codmenor);
		System.out.println("Média de veiculos nas 5 Cidades: "+mediacars);
		System.out.println("Média de acidentes nas Cidades com menos de 2.000 veículos de passeio: "+mediafloat+" veiculos.");
	}
}
