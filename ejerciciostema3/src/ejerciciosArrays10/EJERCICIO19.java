package ejerciciosArrays10;

import java.util.Scanner;

public class EJERCICIO19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un texto");
		String texto = sc.nextLine();
		Integer numero = 0;
		String[] a = texto.split("");
		for (int i = 0; i < a.length; i++) {
			if (a[i].equalsIgnoreCase("a")) {
				numero++;
			}
		}
		System.out.println("el texto tiene " + numero + " A");

	}
}
