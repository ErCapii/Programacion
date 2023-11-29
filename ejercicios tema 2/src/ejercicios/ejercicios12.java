package ejercicios;

import java.util.Scanner;

public class ejercicios12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String usuario = "";
		int usuario10 = 0;

		do {
			System.out.println("Dime un usuario");
			usuario = sc.nextLine();
			usuario = usuario.toUpperCase();
			usuario = usuario.trim();
			usuario10 = usuario.length();
			sc.close();
			if (usuario10 < 10) {
				System.out.println("No puede ser inferior a 10 letras");

			} else if (usuario.contains(" "))

			{
				System.out.println("No puede contener espacios");
			}

		} while (usuario10 < 10 || usuario.contains(" "));
		{

			System.out.println("Tu usario es " + usuario);
		}

	}
}
