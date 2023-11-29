package ejercicios;

import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) {

		System.out.println("Cual es tu fecha de nacimiento?");

		Scanner sc = new Scanner(System.in);
		Integer año = sc.nextInt();

		// consiste en introducir la edad segun generacion usa else if para separar
		// generaciones

		if (año >= 2010) {
			System.out.println("Eres generacion Alfa");
		} else if (año >= 1997) {
			System.out.println("Eres generacion Z");
		} else if (año >= 1981) {
			System.out.println("Eres generacion Y");
		} else if (año >= 1965) {
			System.out.println("Eres generacion X");
		} else if (año >= 1946) {
			System.out.println("Eres generacion Boomers");
		} else if (año >= 1928) {
			System.out.println("Eres generacion Silenciosa");
		}

		System.out.println("fin");
		sc.close();
	}

}
// if(año>=1997 && año<2010) otra solucion