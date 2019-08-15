import java.util.Scanner;

public class Ex_23 {
	
	static Scanner entrada;
	
	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		int turmas;
		int alunos = 0;
		
		int totalAlunos = 0;
		
		System.out.print("Quantas turmas são? ");
		turmas = entrada.nextInt();
		
		for (int k=0; k<turmas; k++) {
			
			boolean ok = true;
			
			while (ok) {
				System.out.print("Quantos alunos tem na "+ (k+1)+"º turma?");
				alunos = entrada.nextInt();
				
				if (alunos<= 40)
					ok = false;
				else
					System.out.println("numero maximo de alunos é 40");
				}
			totalAlunos += alunos;
		}
		
		float media = totalAlunos/turmas;
		System.out.print("O número médio de alunos por turma é: "+ (media));
		
		
		entrada.close();
	}
}
