package ejerciciosavanzados;

import java.util.Scanner;

public class EJERCICIOSS2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		String impresion = "- ";
		String estrella = "* ";
		int repeticion = 1;
		int finish = 0;
		int aux = 1;
		do {
			System.out.println("dime un numero mayor de 0");
			numero = sc.nextInt();
			finish = numero;

		} while (numero <= 0);

		for (int casillas = 1; casillas <= numero; casillas++) {
			for (int bloques = 1; bloques <= numero; bloques++) {

				if (repeticion == casillas || finish == aux) {
					System.out.print(estrella);
				} else {
					System.out.print(impresion);
				}
				repeticion++;
				aux++;
			}
			System.out.println();
			finish--;
			repeticion = 1;
			aux = 1;

		}
		sc.close();
	}
}
