package ifsp;
import java.util.Scanner;

public class ElevadorTeste {

	public static void main(String[] args) {
		Elevador meuElevador = new Elevador();
		Scanner scanf = new Scanner(System.in);
		int botao = 0;
		System.out.println("Voc� esta dentro do elevador!");
		System.out.println("1 - Subir / 2 - Descer / 3 - Abrir Porta");
		System.out.println("Fa�a sua escolha!");
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
		System.out.println("Voc� sai do elevador, mas n�o faz ideia de onde est�...");
	}
}