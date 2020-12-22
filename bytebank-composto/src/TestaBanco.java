
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente diego = new Cliente();
		
		diego.nome = "Diego Marques";
		diego.cpf = "40635235962";
		diego.profissao = "programador";
		
		Conta c1 = new Conta();
		c1.deposita(100);
		
		c1.titular = diego;
		System.out.println(c1.titular.nome);
	}
}