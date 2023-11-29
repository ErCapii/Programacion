package ejerciciospracticosderepaso;

import java.util.Scanner;

public class EJERCICIOS3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer eleccion = 0;

		for (; eleccion <= 3 || eleccion > 4;) {
			System.out.println("*** Menú ***");
			System.out.println("\t1. Abrir");
			System.out.println("\t2. Guardar");
			System.out.println("\t3. Modificar");
			System.out.println("\t4. Salir");
			eleccion = sc.nextInt();
			if (eleccion > 4) {
				System.out.println("no es correcta");
			} else if (eleccion == 1) {
				System.out.println("Abrir");
			} else if (eleccion == 2) {
				System.out.println("Guardar");
			} else if (eleccion == 3) {
				System.out.println("Modificar");
			}
		}
		if (eleccion == 4) {
			System.out.println("Bye Bye");
		}
		sc.close();

	}

}
