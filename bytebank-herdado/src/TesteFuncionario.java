
public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Diego Marques");
		f1.setCPF("40635235861");
		f1.setSalario(2590.80);
		
		System.out.println(f1.getNome());
		System.out.println(f1.getCPF());
		System.out.println(f1.getSalario());
		
	}
}
