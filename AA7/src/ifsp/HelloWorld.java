package ifsp;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		System.out.println("Ol�, qual seu nome?");
		String nome = scanf.nextLine();
		System.out.println("Ol� mundo para voc� " + nome);
	}
}