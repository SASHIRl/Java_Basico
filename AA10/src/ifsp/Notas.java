package ifsp;

public class Notas {
	
	public static float media (float nota1, float nota2) {
		float result = (nota1 + nota2) / 2;
		return result;
	}
	public static float media (float nota1, float nota2, float nota3) {
		float result = (nota1 + nota2 + nota3) / 3;
		return result;
	}
	public static float media (float nota1, float nota2, float nota3, float nota4) {
		float result = (nota1 + nota2 + nota3 + nota4) / 4;
		return result;
	}
	public static float media (float nota1, float nota2, float nota3, float nota4, float nota5) {
		float result = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
		return result;
	}
}