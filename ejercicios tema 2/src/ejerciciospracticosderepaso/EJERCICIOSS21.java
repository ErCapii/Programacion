package ejerciciospracticosderepaso;

import java.util.Scanner;

public class EJERCICIOSS21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		String impresion = "- ";
		String estrella = "* ";
		int repeticion = 1;

		do {
			System.out.println("dime un numero mayor de 0");
			numero = sc.nextInt();

		} while (numero <= 0);

		for (int casillas = 1; casillas <= numero; casillas++) {
			repeticion = 1;

			for (int bloques = 1; bloques < numero; bloques++) {

				if (repeticion == casillas) {
					System.out.print(estrella);
				}
				System.out.print(impresion);
				repeticion++;

				}
				if (repeticion == casillas) {
				System.out.print(estrella);

			}
				System.out.println();
				sc.close();
		}

	}
}
