package ejercicios;

import java.util.Scanner;

public class ejercicios10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena1 = "";
		String cadena2 = "";

		do {
			System.out.println("dime una letra");
			cadena1 = sc.nextLine();

			System.out.println("dime otra letra");
			cadena2 = sc.nextLine();
			sc.close();
		} while (cadena1.isEmpty() || cadena1.isBlank() || cadena2.isEmpty() || cadena2.isBlank());
		{
			{
				int alfabetico = cadena1.compareTo(cadena2);

				if (alfabetico < 0) {
					System.out.println(cadena1+" va antes de "+cadena2);
				} else if (alfabetico > 0) {
					System.out.println(cadena2+" va antes de "+cadena1);
				}

			}
		}

	}

}
