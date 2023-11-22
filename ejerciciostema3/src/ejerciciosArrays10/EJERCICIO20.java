package ejerciciosArrays10;

import java.util.Random;
import java.util.Scanner;

public class EJERCICIO20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
		Integer contador = 1;
		Integer fallos = 0;
		
		String[] palabras = new String[] { "azulejo", "tenedor", "saltamontes", "carretilla", "molinero", "sotificado",
				"terremoto", "culinario", "teclado", "primavera" };
		
		Integer aleatorio = rm.nextInt(0, 9);
		String[] palabraDividida = palabras[aleatorio].split("");
		String[] espacios = new String[palabraDividida.length];
		for (int i = 1; i < espacios.length; i++) {
			espacios[i] = "_";
		}

		System.out.println("La primera palabra es " + palabraDividida[0] + " y contiene " + palabraDividida.length + " letras");
		espacios[0] = palabraDividida[0];
		for (int i = 1; contador < palabraDividida.length || fallos >= 10; i++) {
			String letra = sc.nextLine();
			if (i <= palabraDividida.length) {
				i = 1;
			}
			Boolean repetir = false;
			for (int j = 1; j < espacios.length; j++) {
				if (letra.equals(espacios[j])) {
					System.out.println("No puedes repetir");
					repetir = true;
					break;
				}
			}
			if (repetir == false) {
				String acierto="";
				for (int j = 1; j < palabraDividida.length; j++) {
					if (letra.equalsIgnoreCase(palabraDividida[j])) {
						espacios[j] = palabraDividida[j];
						contador++;
						acierto = "bien";
					}
				}

				for (int k = 0; k < espacios.length; k++) {
					System.out.print(" " + espacios[k] + " ");
				}
				System.out.println();
				if (acierto.equals("bien")) {
					System.out.println("es correcto");
				} else {
					System.out.println("no es correcto");
					fallos++;
				}
			}
		}
		if (fallos == 10) {
			System.out.println("Game over");
		} else
			System.out.println("Has ganado y has tenido " + fallos + " fallos");
	}
}
