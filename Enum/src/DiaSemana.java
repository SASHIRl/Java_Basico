
public enum DiaSemana {
	
	SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), 
	SABADO(6), DOMINGO(7); //N�o foi necess�rio instanciar o objeto, pois, quando declaramos um "DOMINGO" j� estamos chamando o construtor ali mesmo. // Objeto = new Objeto...
	
	private int valor;
	
	DiaSemana(int valor) { //N�o � necess�rio utilizar modificador de acesso ao declarar o construtor, o construtor do Enum j� � utilizado internamente pelo pr�prio enumerador. // Private, public, static... //
		this.valor = valor;
	}	
	
	public int getValor() { // N�o existe heran�a em classe enum.
		return valor;
	}
}