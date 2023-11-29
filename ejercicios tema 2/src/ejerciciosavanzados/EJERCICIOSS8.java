package ejerciciosavanzados;

import java.util.Random;
import java.util.Scanner;

public class EJERCICIOSS8 {
	public static void main(String[] args) {
		Random rm = new Random();
		Scanner sc = new Scanner(System.in);
		Integer jposicion = 0;
		Integer bposicion = 0;
		Integer dado = 0;
		String espacio;
		do {
			do {
				System.out.println("tira el dado");
				espacio = sc.nextLine();
				if (!espacio.isEmpty()) {
					System.out.println("por favor pulsa solo ENTER");
				}
			} while (!espacio.isEmpty());
			dado = rm.nextInt(1, 7);
			jposicion += dado;
			if (jposicion > 60) {
				jposicion -= dado;
				System.out.println("Te as pasado retrocedes hasta la casilla " + jposicion);
			} else {
				System.out.println("Tu posicion es " + jposicion);
			}
			dado = rm.nextInt(1, 7);
			bposicion += dado;
			if (bposicion > 60) {
				bposicion -= dado;
				System.out.println("El bot se ha pasado retrocede hasta la casilla " + bposicion);
			} else {
				System.out.println("La posicion del bot es " + bposicion);
			}
		} while (jposicion != 60 && bposicion != 60);
		if (jposicion == 60) {
			System.out.println("Has ganado");
		} else {
			System.out.println("pierdes");
		}
		sc.close();
	}
}
