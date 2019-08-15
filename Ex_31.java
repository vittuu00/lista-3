import java.util.Scanner;

public class Ex_31 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int altmenor = 0;
		int altmaior = 0;
		int numaluno1 = 0, numaluno2 = 0;
		for( int i = 0; i < 9; i++) {
			System.out.print("\nDigite o número do aluno: ");
			int num_aluno = entrada.nextInt();
			
			System.out.print("Digite sua altura em centimetros: ");
			int alt_aluno = entrada.nextInt();
			
			if(i == 0){
				altmenor = alt_aluno;
				altmaior = alt_aluno;
			}else if(alt_aluno > altmaior) {
				altmaior = alt_aluno;
				numaluno1 = num_aluno;
			}else if(alt_aluno < altmenor) {
				altmenor = alt_aluno;
				numaluno2 = num_aluno;
			}
		}
			System.out.println("Aluno mais alto: "+altmaior+"Cm / / Número do Aluno: "+numaluno1);
			System.out.println("Aluno mais baixo: "+altmenor+"Cm / / Número do Aluno: "+numaluno2);
		
			entrada.close();
	}
}
