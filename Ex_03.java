import java.util.Scanner;

public class Ex_03 {
	
	static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		entrada = new Scanner(System.in);
		
		
		boolean ok2 = true;
		String nome;
		int idade;
		float salario;
		
		while (ok2) {
		System.out.println("Digite seu nome: ");
		nome = entrada.nextLine();
		if (nome.length() < 3)
			System.out.print("digite um nome com mais de 3 caracteres");
		else
			ok2 = false;
		}
		
		while(!ok2) {
			System.out.print("digite sua idade: ");
			idade = entrada.nextInt();
				if (idade < 0 || idade > 150)
					System.out.println("idade invalidade, digite um numero maior que 0 e menor que 150");
				else
					ok2 = true;			
		}
		
		while (ok2) {
			System.out.println("Digite seu salario: ");
			salario = entrada.nextInt();
			if (salario < 0)
				System.out.print("digite um salario maior que 0");
			else
				ok2 = false;
			}
				
		boolean sair = true;
		char letra;
			
		while (sair) {
			System.out.print("Digite M para masculino e F para feminino: ");
			letra = entrada.next().charAt(0);
			if(letra == 'M' || letra == 'm') {
				System.out.println("masculino");
				sair = false;
			}else if(letra == 'f' || letra == 'F') {
				System.out.println("feminino" );
				sair = false;
			}else 
				System.out.println("informação errada, digite novamente");
			}
		
		sair = true;
		
		while (sair) {
			System.out.print("Digite S para solteiro, C para casado, V para viuvo ou D para divorciado: ");
			letra = entrada.next().charAt(0);
			if(letra == 'S' || letra == 's') {
				System.out.println("Solteiro");
				sair = false;
			}else if(letra == 'V' || letra == 'v') {
				System.out.println("viuvo" );
				sair = false;
			if(letra == 'C' || letra == 'c') {
				System.out.println("Casado");
				sair = false;
			}else if(letra == 'D' || letra == 'd') {
				System.out.println("Divorciado" );
				sair = false;	
			}else 
				System.out.println("informação errada, digite novamente");
			}
		
		

			
			entrada.close();
		}
	}
}

