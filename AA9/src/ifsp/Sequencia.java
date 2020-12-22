package ifsp;
import java.util.Scanner;

public class Sequencia {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int[] fibonacci = {0, 1};
		System.out.println("Digite a quantidade de elementos na sequencia: ");
		int qtd = scanf.nextInt();
		
		for (int sequencia = 0; sequencia < qtd; sequencia++ ) {
			if (sequencia == 0 ) {
				System.out.println("0");
				System.out.println("1");
			}
			int resultado = fibonacci[0] + fibonacci[1];
			fibonacci[0] = fibonacci[1];
			fibonacci[1] = resultado;
			System.out.println(resultado);
		}
	}
}