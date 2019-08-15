import java.util.Scanner;

public class Ex_34 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		boolean parar = true;

		float nums = 0;
		int ate25 = 0, ate50 = 0, ate75 = 0, ate100 = 0;

		while (parar != false) {
			System.out.print("Informe diversos números:");
			nums = entrada.nextInt();

			if (nums < 0) {
				parar = false;
			}
			if (nums >= 0 && nums <= 25) {
				ate25++;
			} else if (nums >= 26 && nums <= 50) {
				ate50++;
			} else if (nums >= 51 && nums <= 75) {
				ate75++;
			} else if (nums >= 76 && nums <= 100) {
				ate100++;
			}
		}
	System.out.println(" ");
	System.out.println("[0-25]   = "+ate25);
	System.out.println("[26-50]  = "+ate50);
	System.out.println("[51-75]  = "+ate75);
	System.out.println("[76-100] = "+ate100);
	}
}