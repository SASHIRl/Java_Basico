package atividade06;

public class Filme {
	private String titulo;
	private int ano;
	
	public Filme (String titulo, int ano) {
		this.setTitulo(titulo);
		this.setAno(ano);
	}
	
	public String getTitulo() {
		return titulo;
	}
	public int getAno() {
		return ano;
	}
	public void setTitulo(String titulo) {
	if(titulo.isEmpty()) {
		throw new IllegalArgumentException("O campo não pode estar vazio");
	}
	this.titulo = titulo;
}
	public void setAno(int ano) {
	if(ano < 1895) {
		throw new IllegalArgumentException("Não existem filmes antes de 1895");
	}
	this.ano = ano;
}
}