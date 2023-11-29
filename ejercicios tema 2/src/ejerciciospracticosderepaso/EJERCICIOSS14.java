package ejerciciospracticosderepaso;

import java.util.Scanner;

public class EJERCICIOSS14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String contraseña;
		Integer longitud;
		do {
			System.out.println("Dime una contraseña de 8 caracteres");
			contraseña = sc.nextLine();
			longitud = contraseña.length();
		} while (longitud > 8 || longitud < 8);
		contraseña = contraseña.replaceAll("a", "4");
		contraseña = contraseña.replaceAll("e", "3");
		contraseña = contraseña.replaceAll("i", "1");
		contraseña = contraseña.replaceAll("o", "0");
		contraseña = contraseña.replaceAll("t", "7");
		System.out.println(contraseña);
		sc.close();

	}
}

