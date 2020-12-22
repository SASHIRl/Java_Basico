package atividade06;

import java.util.List;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) {

		Filme f1 = new Filme("Suspiria", 1977);
		Filme f2 = new Filme("Phenomena", 1985);
		Filme f3 = new Filme("Profondo rosso", 1975);
		
		Ator a0 = new Ator ("Jessica Harper", f1);
		Ator a1 = new Ator ("Stefania Casini", f1);
		Ator a2 = new Ator ("Jennifer Connelly", f2);
		Ator a3 = new Ator ("Daria Nicolodi", f2);
		Ator a4 = new Ator ("David Hemmings", f3);
		Ator a5 = new Ator ("Daria Nicolodi", f3);
		
		a0.addFilme(f1);
		a1.addFilme(f1);
		a2.addFilme(f2);
		a3.addFilme(f2);
		a4.addFilme(f3);
		a5.addFilme(f3);
		
		System.out.println(a0.getNome());
		
		for(int i = 1; i < a1.getFilmes().size(); i++) {
			Filme f = a1.getFilmes().get(i);
			System.out.println(f.getTitulo() + ", " + f.getAno());
		}
	}
}