
public class TestEnum2 {
	public static void main(String[] args) {
		
		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
		
		DiaSemana dia = Enum.valueOf(DiaSemana.class, "SABADO");
		
		System.out.println(dia);
	}
}
