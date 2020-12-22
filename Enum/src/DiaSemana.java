
public enum DiaSemana {
	
	SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), 
	SABADO(6), DOMINGO(7); //Não foi necessário instanciar o objeto, pois, quando declaramos um "DOMINGO" já estamos chamando o construtor ali mesmo. // Objeto = new Objeto...
	
	private int valor;
	
	DiaSemana(int valor) { //Não é necessário utilizar modificador de acesso ao declarar o construtor, o construtor do Enum já é utilizado internamente pelo próprio enumerador. // Private, public, static... //
		this.valor = valor;
	}	
	
	public int getValor() { // Não existe herança em classe enum.
		return valor;
	}
}