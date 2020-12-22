package bytecode;

public class TestaMetodo {
	
	public static void main (String [] args) {
		Conta c1 = new Conta();
		c1.saldo = 100;
		c1.deposita(50);
		System.out.println(c1.saldo);
		
		Conta c2 = new Conta();
		c2.deposita(1000);
		
		c2.transfere(300, c1);
		
		
		boolean conseguiuRetirar = c1.saca(20);
		System.out.println(c1.saldo);
		System.out.println(conseguiuRetirar);
		System.out.println(c2.saldo);
		System.out.println(c1.saldo);
		
		c1.titular = "Diego Marques";
		System.out.println(c1.titular);
	}
}