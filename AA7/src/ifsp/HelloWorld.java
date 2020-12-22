package ifsp;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		System.out.println("Olá, qual seu nome?");
		String nome = scanf.nextLine();
		System.out.println("Olá mundo para você " + nome);
	}
}