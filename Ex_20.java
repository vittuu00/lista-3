import java.util.Scanner;

public class Ex_20 {
	
	static Scanner entrada;
	
	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		int TAM;
		float media = 0;
		
		System.out.print("Quantas notas s�o? ");
		TAM = entrada.nextInt();
		
		for (int k=0; k<TAM; k++) {
			
			System.out.print("Digite a nota: ");
			float nota = entrada.nextInt();
			
			media += nota;
			
		}
		
		System.out.println("A m�dia do aluno � :"+ (media / TAM));
		
		entrada.close();
	}
}
