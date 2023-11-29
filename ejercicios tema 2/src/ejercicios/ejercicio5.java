package ejercicios;

public class ejercicio5 {
	public static void main(String[] args) {

		Integer suma = 0;

		for (int valor = 1; valor <= 10000; valor++) {
			suma = suma + valor;
		}

		System.out.println(suma);
	}
}