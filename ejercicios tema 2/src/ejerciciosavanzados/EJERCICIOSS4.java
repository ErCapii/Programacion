package ejerciciosavanzados;

import java.util.Scanner;

public class EJERCICIOSS4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String letrainicial;
		String letrafinal;
		Integer final1 = 0;
		Integer final2 = 0;
		Integer inicio = 0;
		Integer inicio2 = 1;
		Integer capicua = 0;

		System.out.println("di un numero de al menos 3 cifras");
		Integer numero = sc.nextInt();
		String palabra = numero.toString();
		final1 = palabra.length();
		final2 = palabra.length();

		do {

			letrainicial = palabra.substring(inicio, inicio2);
			inicio++;
			inicio2++;

			final2--;
			letrafinal = palabra.substring(final2, final1);

			final1--;

			if (letrainicial.equals(letrafinal)) {
				capicua++;
			} else {
				System.out.println("no es capicua");
				capicua = palabra.length();
			}
		} while (palabra.length() != capicua);
		if (letrainicial.equals(letrafinal)) {
			System.out.println("es capicua");
			sc.close();
		}
	}
}
