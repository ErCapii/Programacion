package ejerciciospracticosderepaso;

import java.util.Scanner;

public class EJERCICIOSS12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer numero = 1;
		String impresion = "|__";
		String guion = "_";
		do {
			System.out.println("Dime un numero mayor que cero");
			numero = sc.nextInt();
			if (numero < 0) {
				System.out.println("Numero no valido");
			}
		} while (numero < 0);
		if (guion.startsWith("_")) {
			System.out.print(" ");

		}
		for (int guionsuma = 1; guionsuma < numero * 3; guionsuma++) {
			System.out.print(guion);
			if (guionsuma == numero * 3) {
				System.out.print(" ");
			}
		}
		System.out.println();
		for (int casillas = 1; casillas <= numero; casillas++) {

			for (int bloques = 1; bloques <= numero; bloques++) {
				System.out.print(impresion);
			}
			if (impresion.endsWith("|__")) {
				System.out.print("|");
			}
			System.out.println();
		}sc.close();
	}
}
