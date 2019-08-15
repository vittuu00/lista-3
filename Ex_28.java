import java.util.Scanner;

public class Ex_28 {
	
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		boolean sair = false; 
		int tempmaior = 0;
		int tempmenor = 0;
		int media = 0;
		boolean fi = true;
		int i = 0;
		
		while(sair != true) {
			
			System.out.println("Digite um temperatura: ");
			int temp = entrada.nextInt();
			
			if(fi == true) {
				tempmaior = temp;
				tempmenor = temp;
			}else if (temp > tempmaior) {
				tempmaior = temp;
			}else if(temp < tempmenor) {
				tempmenor = temp;
			}
			
			fi = false;
			media = media + temp;
			i++;	
			
			System.out.println("Deseja continuar? \n1- Continuar \n2- Parar o Programa");
			int nintendo = entrada.nextInt();
			switch(nintendo) {
				case(1): 
					System.out.println("Continuando \n. \n. \n.");
				break;
				case(2):
					sair = true;
				break;
				default:
					System.out.println("Continuando \n. \n. \n.");
			}
		}
		
		System.out.println("Temperatura mais alta: "+tempmaior+" °C");
		System.out.println("Temperatura menor :"+tempmenor+" °C");
		
		media = media / i;
		
		System.out.println("Media de Temperatura: "+media+" °C");
	}
}