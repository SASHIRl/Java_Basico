package ifsp;

public class Elevador {

	public boolean portaAberta = false;
	public int andarAtual = 1;
	public final int ANDAR_MAXIMO = 10;
	public final int ANDAR_MINIMO = 1;
	
	public void abrirPorta() {
		if (portaAberta == true) {
			System.out.println("Porta já está aberta!");
		} else {
			System.out.println("Abrindo porta.");
			portaAberta = true;
			System.out.println("A porta está aberta.");
			System.out.println(andarAtual + "º andar.");
		}
	}
	public void fecharPorta() {
		if(portaAberta == false) {
			System.out.println("Porta já está fechada!");
		} else {
			System.out.println("Fechando porta.");
			portaAberta = false;
			System.out.println("A porta está fechada.");
		}
	}
	
	public void descer() {
		if (andarAtual == 1) {
			System.out.println("Andar mínimo, não é possível descer mais!");
		} else {
			andarAtual--;
			System.out.println("Você está no andar: " + andarAtual);
		}
	}
	public void subir() {
		if (andarAtual == 10) {
			System.out.println("Você está no andar máximo, não é possível subir mais!");
		} else {
			andarAtual++;
			System.out.println("Você está no andar: " + andarAtual);
		}
	}
}