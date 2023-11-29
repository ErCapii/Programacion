package ejerciciosavanzados;

import java.util.Scanner;

public class EJERCICIOSS5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insertar texto");
		String texto = sc.nextLine();
		sc.close();
		Integer a;
		Integer na = 0;
		Integer contador = 0;
		Boolean fin = true;
		a = texto.indexOf("a");
		do {
			na = a + 1;
			if (a != -1) {
				a = texto.indexOf("a", na);
				contador++;
			} else
				fin = false;

		} while (fin);
		System.out.println("aparecen " + contador + " a en el texto");

	}
}
