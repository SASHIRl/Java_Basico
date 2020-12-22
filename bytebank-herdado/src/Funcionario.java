public class Funcionario {
	
	private String nome;
	private String CPF;
	private double salario;
		
	public Funcionario () { //Contrutor da classe n�o retorna nada, por isso entra j� como "public e nome da classe"
		
	}

	public double getBonificacao() {
		return this.salario * 0.1;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getSalario() {
		return salario;
	}
}
