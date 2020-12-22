package ifsp;

public class Elevador {

	public boolean portaAberta = false;
	public int andarAtual = 1;
	public final int ANDAR_MAXIMO = 10;
	public final int ANDAR_MINIMO = 1;
	
	public void abrirPorta() {
		if (portaAberta == true) {
			System.out.println("Porta j� est� aberta!");
		} else {
			System.out.println("Abrindo porta.");
			portaAberta = true;
			System.out.println("A porta est� aberta.");
			System.out.println(andarAtual + "� andar.");
		}
	}
	public void fecharPorta() {
		if(portaAberta == false) {
			System.out.println("Porta j� est� fechada!");
		} else {
			System.out.println("Fechando porta.");
			portaAberta = false;
			System.out.println("A porta est� fechada.");
		}
	}
	
	public void descer() {
		if (andarAtual == 1) {
			System.out.println("Andar m�nimo, n�o � poss�vel descer mais!");
		} else {
			andarAtual--;
			System.out.println("Voc� est� no andar: " + andarAtual);
		}
	}
	public void subir() {
		if (andarAtual == 10) {
			System.out.println("Voc� est� no andar m�ximo, n�o � poss�vel subir mais!");
		} else {
			andarAtual++;
			System.out.println("Voc� est� no andar: " + andarAtual);
		}
	}
}