import java.util.Scanner;

public class Ex_02 {
	
	static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		entrada = new Scanner(System.in);
		
		
				String senha;
				String usuario;
				boolean ok = true;
				
				while (ok) {
			
				entrada.nextLine();
				System.out.print("Digite seu usario de login:  ");
				usuario = entrada.nextLine();	
				
				System.out.print("Digite sua senha de login:  ");
				senha = entrada.nextLine();
				
				if (usuario.equals(senha)) 
					System.out.println("seu usuario e senha são iguais, digite uma senha diferente");
				else
					ok = false;
				}
				System.out.println("usuario e senha cadastrados com sucesso!");
						
				
			
			
			entrada.close();
		}
	}

