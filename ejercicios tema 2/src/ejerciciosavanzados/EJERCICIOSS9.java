package ejerciciosavanzados;

import java.util.Random;
import java.util.Scanner;

public class EJERCICIOSS9 {
	public static void main(String[] args) {
		Random rm = new Random();
		Scanner sc = new Scanner(System.in);
		Integer jposicion = 0;
		Integer bposicion = 0;
		Integer dado = 0;
		String espacio;
		Integer repetir = 0;
		Integer repetirbot = 0;
		do {
			do {
				System.out.println("tira el dado");
				espacio = sc.nextLine();
				if (!espacio.isEmpty()) {
					System.out.println("por favor pulsa solo ENTER");
				}
			} while (!espacio.isEmpty());
			do {
				dado = rm.nextInt(1, 7);
				jposicion += dado;
				if (jposicion > 60) {
					jposicion -= dado;
					System.out.println("Te as pasado retrocedes hasta la casilla " + jposicion);
				} else if (dado == 6) {
					System.out.println("Has sacado 6 tu posicion ahora es " + jposicion + " y tiras de nuevo");
				} else if (jposicion % 5 == 0 && jposicion < 60) {
					System.out.println("Has sacado " + dado + " tu posicion ahora es " + jposicion);
					jposicion += 5;
					System.out.println(" y de oca en oca tiro porque me toca y me voy al " + jposicion);
				} else {
					System.out.println("Has sacado " + dado + " tu posicion ahora es " + jposicion);
				}
				if (repetirbot == 1 || repetirbot == 2 || repetirbot == 3 || repetirbot == 4) {
					repetirbot--;
				}
				switch (jposicion) {
				case 19:
					System.out.println("Pierdes 1 turnos");
					repetir = 2;
					break;
				case 31:
					System.out.println("Pierdes 2 turnos");
					repetir = 3;
					break;
				case 56:
					System.out.println("Pierdes 3 turnos");
					repetir = 4;
					break;
				}

			} while (dado == 6 || repetirbot != 0);
			do {
				dado = rm.nextInt(1, 7);
				bposicion += dado;
				if (bposicion > 60) {
					bposicion -= dado;
					System.out.println("El bot se ha pasado retrocede hasta la casilla " + bposicion);
				} else if (dado == 6) {
					System.out.println("Has sacado 6 tu posicion ahora es " + bposicion + " y tiras de nuevo");
				} else if (bposicion % 5 == 0 && bposicion < 60) {
					System.out.println("Has sacado " + dado + " tu posicion ahora es " + jposicion);
					bposicion += 5;
					System.out.println(" y de oca en oca tiro porque me toca y me voy al " + bposicion);
				} else {
					System.out.println("El bot a sacado " + dado + " su posicion ahora es " + bposicion);
				}
				if (repetir == 1 || repetir == 2 || repetir == 3 || repetir == 4) {
					repetir--;
				}
				switch (bposicion) {
				case 19:
					System.out.println("Pierdes 1 turnos");
					repetirbot = 1;
					break;
				case 31:
					System.out.println("Pierdes 2 turnos");
					repetirbot = 2;
					break;
				case 56:
					System.out.println("Pierdes 3 turnos");
					repetirbot = 3;
					break;

				}
			} while (dado == 6 || repetir != 0);
		} while (jposicion != 60 && bposicion != 60);
		if (jposicion == 60) {
			System.out.println("Has ganado");
		} else {
			System.out.println("pierdes");
		}
		sc.close();
	}

}
