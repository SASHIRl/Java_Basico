public class FuncionarioAutenticavel extends Funcionario {
	private int senha;
	private int departamento;

	public boolean autenticaSenha(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	public double getBonificacao() {
		return this.salario * 1.4 + 1000;
		/*return super.getBonificacao() + 1000;*/
	}
	@Override
	public void setSalario(double salario) {
		// TODO Auto-generated method stub
		super.setSalario(salario);
	}public int getSenha() {
		return senha;
	}
	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}
	public int getDepartamento() {
		return departamento;
	}
}