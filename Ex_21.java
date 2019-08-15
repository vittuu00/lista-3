import java.util.Scanner;

public class Ex_21 {
	
	static Scanner entrada;
	
	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		int TAM;
		float media = 0;
		
		System.out.print("Quantos alunos são? ");
		TAM = entrada.nextInt();
		
		for (int k=0; k<TAM; k++) {
			
			System.out.print("Digite a idade do aluno: ");
			int idade = entrada.nextInt();
			
			media += idade;
			
		}
		
		media = media/TAM;
		
		if (media > 0 && media <= 25) 
			System.out.println("turma jovem");
		
		if (media > 25 && media <= 60) 
			System.out.println("turma adulta");
		
		if (media > 60) 
			System.out.println("turma idosa");
		
		entrada.close();
	}
}
