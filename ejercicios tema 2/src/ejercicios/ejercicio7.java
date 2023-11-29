package ejercicios;

import java.util.Scanner;

public class ejercicio7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer n1 = 0;
		Integer n2 = 0;

		do {

			System.out.println("Dime un numero");
			n1 = sc.nextInt();
			System.out.println("Dime otro numero");
			n2 = sc.nextInt();

		} while (n1 != n2);
		System.out.println("Adios");
		sc.close();
	}
}
