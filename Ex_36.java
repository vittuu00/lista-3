import java.util.Scanner;

public class Ex_36 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		boolean parar = true;
		int voto, candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0, nulo = 0, branco = 0, cont = 0;

		while (parar != false) {
			System.out.println("Escolha seu candidato:\n\n1- João Goiaba \n2- Jorge Euclides \n3- Parmênides \n4- Alex Lagartixa \n5- Voto Nulo \n6- Voto em Branco \n0- Para Sair");
			voto = entrada.nextInt();

			if(voto == 0) {
				parar = false;
			}
		switch (voto) {

			case (1):
				candidato1++;
			break;

			case (2):
				candidato2++;
			break;

			case (3):
				candidato3++;
			break;

			case (4):
				candidato4++;
			break;

			case (5):
				nulo++;
			break;

			case (6):
				branco++;
			break;
		
			default: 
					System.out.println("Fim da votação!");
			}
			
			cont++;
		}
		
		System.out.println(cont);
		System.out.println("Candidato João Goiaba recebeu " +candidato1+" votos");
		System.out.println("Candidato Jorge Euclides recebeu "+candidato2+" votos");
		System.out.println("Candidato Parmênides recebeu "+candidato3 +" votos");
		System.out.println("Candidato Alex Lagartixa recebeu "+candidato4 +" votos");
		System.out.println("O total de votos nulos é: "+nulo);
		System.out.println("O total de votos em branco é: "+branco);
		
		float porc1 = 100 * (nulo / cont);
		float porc2 = 100 * (branco / cont);
		
		System.out.println("A percentagem de votos nulos sobre o total de votos é: "+porc1);
		System.out.println("A percentagem de votos em branco sobre o total de votos é: "+porc2);
	
		entrada.close();
	}
}