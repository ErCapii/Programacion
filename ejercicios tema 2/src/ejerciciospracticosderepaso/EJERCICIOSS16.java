package ejerciciospracticosderepaso;

import java.util.Scanner;

public class EJERCICIOSS16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una palabra");
		String palabra = sc.nextLine();
		Integer posicion = 0;
		Integer posicion2 = 1;
		String letra;

		do {
			letra = palabra.substring(posicion, posicion2);
			System.out.println(letra);
			posicion++;
			posicion2++;

		} while (posicion2 <= palabra.length());
		System.out.println();
		System.out.println("fin");
		sc.close();
}
}
