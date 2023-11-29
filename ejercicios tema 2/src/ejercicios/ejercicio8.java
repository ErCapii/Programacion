package ejercicios;

import java.util.Scanner;

public class ejercicio8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String n1;
		String n2;

		do {

			System.out.println("Dime un numero");
			n1 = sc.nextLine();
			n1 = n1.trim();
			n1 = n1.toLowerCase();
			System.out.println("Dime otro numero");
			n2 = sc.nextLine();
			n2 = n2.trim();
			n2 = n2.toLowerCase();
		} while (!n1.equals(n2));

		System.out.println("Adios");
		sc.close();

	}
}
