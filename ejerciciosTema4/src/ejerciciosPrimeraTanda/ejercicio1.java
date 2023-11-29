package ejerciciosPrimeraTanda;

public class ejercicio1 {

	public static void main(String[] args) {
		String parametro = " hola como estas ";
		String parametroCambiado = getMayusculas(parametro);
		System.out.println(parametroCambiado);
	}

	public static String getMayusculas(String hola) {
		hola = hola.toUpperCase();
		hola = hola.trim();
		return hola;
	}
}
