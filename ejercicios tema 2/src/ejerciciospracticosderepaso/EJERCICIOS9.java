package ejerciciospracticosderepaso;

import java.util.Scanner;

public class EJERCICIOS9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String hola;
		String ultima;
		String textolimpio;
		do {
			System.out.println("Escribre un texto que comienze por (hola) y termine en (hastaluego)");
			String texto = sc.nextLine();
			hola = texto.substring(0, 4);
			Integer espacio = texto.lastIndexOf(" ");
			ultima = texto.substring(espacio + 1);
			textolimpio = texto.substring(4, espacio);

			if (hola.equals("hola") && (ultima.equals("hastaluego") || ultima.equals("adios"))) {
				System.out.println("Lo he entendido, mensaje:" + textolimpio);
				
			} else if (!hola.equals("hola") || !ultima.equals("hastaluego")) {
				System.out.println("no he entendido el mensaje");

			}

		} while (!hola.equals("hola") || !ultima.equals("adios"));
		
		sc.close();
	}
}