package atividade06;

import java.util.List;
import java.util.ArrayList;


public class Ator {
	
	private String nome;
	private List<Filme> filmes;
	
	public Ator(String nome, Filme filme) { 
		this.filmes = new ArrayList<>();
		this.nome = nome;
		this.filmes.add(filme);
	}

	public String getNome() {
		return nome;
	}
	
	public void addFilme(Filme filme) {
		filmes.add(filme);
	}
	public List<Filme> getFilmes() {
		return filmes;
	}
}	