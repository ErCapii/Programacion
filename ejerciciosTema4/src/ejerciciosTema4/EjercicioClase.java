package ejerciciosTema4;

public class EjercicioClase {
	public static void main(String[] args) {
		cien(1);
	}

	public static void cien(Integer numero) {
		System.out.println(numero);
		if (numero > 1) {
			cien(numero+1);
		}
	}
}
