package ifsp;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = scanf.nextLine();
		System.out.println("Digite sua idade: ");
		int idade = scanf.nextInt();
		System.out.println("Olá " + nome + ", vejo aqui que você tem " + idade + " anos.");
	}
}