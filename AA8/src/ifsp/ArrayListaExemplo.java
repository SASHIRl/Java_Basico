package ifsp;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListaExemplo {

	public static void main(String[] args) {
		
		Scanner scanf = new Scanner(System.in);
		ArrayList minhaLista;
		int select = 0;
		minhaLista = new ArrayList();
		String nome;
		do {
			System.out.println("Digite nomes para a lista: ");
			nome = scanf.nextLine();
			minhaLista.add(nome);
			System.out.println("Se já terminou de adicionar escreva ''sair''!");
		} while (!"sair".equals(nome));
		minhaLista.remove(minhaLista.size() -1); //remover "sair" da lista :)
		System.out.println("Essa é sua lista " + minhaLista);
		System.out.println("Quer remover alguém da lista?");
		System.out.println("1 - sim / 2 - não");
		select = scanf.nextInt();
		if (select == 1) {
			System.out.println("Ok, digite o número da posição no Array de quem quer remover: ");
			int positionRemove = scanf.nextInt();
			System.out.println("O nome ''" + minhaLista.get(positionRemove) + "'' será removido da lista!");
			minhaLista.remove(positionRemove);
			System.out.println("Sua lista atual: " + minhaLista);
			System.out.println("Você tem uma lista com " + minhaLista.size() + " Elementos");
		} else if (select == 2){
			System.out.println("Então finalizamos por aqui, segue sua lista!");
			System.out.println(minhaLista);
			System.out.println("Você tem uma lista com " + minhaLista.size() + " Elementos");			
		}
	}
}
