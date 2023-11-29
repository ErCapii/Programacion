package ejercicios;

import java.util.Scanner;

public class ejercicios11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email;
		Integer arroba;
		String arrobaypunto;
		do {
			System.out.println("Dime tu email");

			email = sc.nextLine();
			arroba = email.indexOf("@");
			arrobaypunto = email.substring(arroba + 1);

		} while (!(email.contains("@") && arrobaypunto.contains(".")) || arrobaypunto.endsWith(".") || arrobaypunto.startsWith("."));
		sc.close();

		System.out.println("tu email es " + email);

	}
}
