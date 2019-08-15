import java.util.Scanner;

public class Ex_29 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int com = 0;
		int term = 0;
		
		System.out.print("Tabuada de qual número: ");
		int tabuada = entrada.nextInt();
		
		
		
		do {
			System.out.print("\nComeçar por: ");
			com = entrada.nextInt();
			
			System.out.print("Terminar por: ");
			term = entrada.nextInt();
			if(com >= term) 
				System.out.print("\nInvalido ");	
		}while(com >= term);
		
		while(com <= term) {
			System.out.println(tabuada+" x "+com+" = "+tabuada*com);
			com++;	
		}		
	}

}
