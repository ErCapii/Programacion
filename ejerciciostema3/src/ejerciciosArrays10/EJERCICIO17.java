package ejerciciosArrays10;

public class EJERCICIO17 {
	public static void main(String[] args) {
		String frase = "Esto es una prueba";
		String[] x = new String[frase.length()];
		x = frase.split(" ");

		x[0] = x[0].toLowerCase();

		for (int i = 1; i < x.length; i++) {
			String aux = x[i];
			x[i] = x[i].substring(0, 1);
			x[i] = x[i].toUpperCase();
			x[i] = x[i] + aux.substring(1);
		}
		for (String string : x) {
			System.out.print(string);
		}

	}
}
