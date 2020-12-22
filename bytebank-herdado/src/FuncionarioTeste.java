public class FuncionarioTeste {
	
	private String nome;
	private String CPF;
	private double salario;
	private int tipo = 0; // 0 Comum 1 Gerente 2 Diretos
		
	public FuncionarioTeste () { //Contrutor da classe não retorna nada, por isso entra já como "public e nome da classe"
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public double getBonificacao() {
		if (this.tipo == 0) {
			return this.salario * 0.1;
		} else if (this.tipo == 1 ) {
			return this.salario;
		} else {
			return this.salario + 1000;
		}
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