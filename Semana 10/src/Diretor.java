
public class Diretor extends FuncionarioAutenticavel implements Autenticavel {
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	@Override
	public double getBonificacao() {
		return this.salario * 1.4 + 1000;
		/*return super.getBonificacao() + 1000;*/
	}
	public boolean autenticaSenha(int senha) {
		if(this.senha == senha) {
			System.out.println("Acesso permitido");
			return true;
		} else {
			System.out.println("Acesso negado");
			return false;
		}
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public int getSenha() {
		return senha;
	}
	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}
}