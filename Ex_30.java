import java.util.Scanner;

public class Ex_30 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float cod = 1;
		float mediaalt = 0 , mediapeso = 0, altmaior = 0,altmenor = 0, pesomenor = 0,pesomaior = 0,codaltmenor = 0,codaltmaior = 0,codpesomenor = 0, codpesomaior = 0;
		int i = 0;
		boolean f1 = true;
		while(cod != 0) {
			
			System.out.print("\nInforme o código: ");
			cod = entrada.nextFloat();
			if(cod != 0 ) {
			System.out.print("\nQual seu peso? ");
			float peso = entrada.nextFloat();
			
			System.out.print("Qual sua altura? ");
			float alt = entrada.nextFloat();
		
			if(f1 == true) {
				altmenor = alt;
				pesomenor = peso;
				f1 = false;
			}
			if (alt > altmaior) {
				altmaior = alt;
				codaltmaior = cod;
			}else if (alt < altmenor) {
				altmenor = alt;
				codaltmenor = cod;
			}
			
			if (peso > pesomaior) {
			pesomaior = peso;
			codpesomaior = cod;
		}else if (peso < pesomenor ) {
			pesomenor = peso;
			codpesomenor = cod;
		}
			
		mediaalt = mediaalt + alt;
		mediapeso = mediapeso + peso;
		i++;
			
			}else if (cod == 0) {
				System.out.println("\nPrograma Finalizado");
			}
		}
			System.out.println("\nCliente mais alto: "+altmaior+" / Codigo: "+codaltmaior);
			System.out.println("Cliente mais baixo: "+altmenor+" / Codigo: "+codaltmenor);
			System.out.println("Cliente mais gordo: "+pesomaior+" / Codigo: "+codpesomaior);
			System.out.println("Cliente mais magro: "+pesomenor+" / Codigo: "+codpesomenor);
			
			mediapeso = mediaalt /i;
			System.out.println("Média de Alturas: "+mediaalt);
			mediapeso = mediapeso /i;
			System.out.println("Media de Peso: "+mediapeso);
		
	}	
	}

