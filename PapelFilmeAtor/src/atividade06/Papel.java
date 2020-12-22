package atividade06;

public class Papel {
	private String nome;
	private boolean protagonista;
	
	public Papel (String nome, boolean protagonista) {
		this.setNome(nome);
		this.setProtagonista(protagonista);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if(nome.isEmpty()) {
			throw new IllegalArgumentException("O campo n�o pode estar vazio");
		}
		this.nome = nome;
	}
	
	public void setProtagonista(boolean protagonista) {
		if(protagonista) {
			System.out.println("� o protagonista");
		} else {
			System.out.println("N�o � o protagonista");
		}
		this.protagonista = protagonista;
	}
}
