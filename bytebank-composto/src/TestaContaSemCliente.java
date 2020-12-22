
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta c2 = new Conta();
		System.out.println(c2.getSaldo());
	
		c2.titular = new Cliente();
		c2.titular.nome = "Marcela";
		System.out.println(c2.titular.nome);
	}
}