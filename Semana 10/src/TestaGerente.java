
public class TestaGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		gerente.setNome("Diego Marques"); //Aqui estamos chamando o m�todo da classe Funcionario
		
		gerente.setSenha(124578); //Aqui estamos chamando um m�todo da classe Gerente.
		
		gerente.setSalario(5000.0);
		System.out.println(gerente.getBonificacao());
		
		ControleDeBonificacoes controle = new ControleDeBonificacoes();
		
		Gerente	funcionario1	=	new	Gerente();
		funcionario1.setSalario(5000.0);
		controle.registra(funcionario1);

		System.out.println(controle.getTotalDeBonificacoes());
	}
}