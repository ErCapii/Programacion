package ejerciciospracticosderepaso;

public class EJERCICIOSS20 {
	public static void main(String[] args) {

		int numero = 10;
		String impresion = "- ";
		String estrella = "* ";
		int repeticion = 1;

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
		}

	}
}
