package ifsp;
import java.util.Scanner;

public class ElevadorTeste {

	public static void main(String[] args) {
		Elevador meuElevador = new Elevador();
		Scanner scanf = new Scanner(System.in);
		int botao = 0;
		System.out.println("Você esta dentro do elevador!");
		System.out.println("1 - Subir / 2 - Descer / 3 - Abrir Porta");
		System.out.println("Faça sua escolha!");
		do {
			botao = scanf.nextInt();
			switch (botao) {
			case 1 :
				meuElevador.subir();
				break;
			case 2 :
				meuElevador.descer();
				break;
			case 3 :
				meuElevador.abrirPorta();
				break;
			}
		} while(botao != 3);
		System.out.println("Você sai do elevador, mas não faz ideia de onde está...");
	}
}