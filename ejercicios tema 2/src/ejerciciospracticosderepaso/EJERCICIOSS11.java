package ejerciciospracticosderepaso;

import java.util.Scanner;

public class EJERCICIOSS11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean repetir = true;
		while (repetir) {
			System.out.println("Dame un numero entero");
			Integer numero1 = sc.nextInt();
			System.out.println("Dame otro numero entero");
			Integer numero2 = sc.nextInt();

			System.out.println("*** MENÚ ***");
			System.out.println("1. Sumar ");
			System.out.println("2. Restar ");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir ");
			System.out.println("0. Salir");
			Integer eleccion = sc.nextInt();
			Integer resultado;

			switch (eleccion) {

			case 1:
				resultado = numero1 + numero2;
				System.out.println(resultado);
				break;
			case 2:
				resultado = numero1 - numero2;
				System.out.println(resultado);
				break;
			case 3:
				resultado = numero1 * numero2;
				System.out.println(resultado);
				break;
			case 4:
				if (numero2 == 0) {
					System.out.println("ese numero no es posible");
				} else {
					resultado = numero1 / numero2;
					System.out.println(resultado);
				}
				break;
			case 0:
				System.out.println("adios");
				repetir = false;
				break;
			default:
				System.out.println("numero no disponible");

			}
		}sc.close();

	}

}
