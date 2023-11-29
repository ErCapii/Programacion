package ejerciciosavanzados;

public class EJERCICIOSS3 {
	public static void main(String[] args) {

		Integer numero = 9;
		Integer resultado = 0;
		Integer suma = 1;

		do {
			if (numero > resultado) {
				resultado = suma + resultado;
				if (resultado < 10) {
					System.out.print(resultado);
				}
			} else {
				suma++;
				resultado = 0;
				System.out.println();
			}
		} while (suma != 6);

	}
}
