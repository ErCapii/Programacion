package ejerciciosPrimeraTanda;

public class ejercicio2 {
	public static void main(String[] args) {
		String parametro = " HOLA COMO ESTAS ";
		String parametroCambiado = getMinusculas(parametro);
		System.out.println(parametroCambiado);
	}

	public static String getMinusculas(String hola) {
		hola = hola.toLowerCase();
		hola = hola.trim();
		return hola;
	}
}
