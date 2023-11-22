package ejerciciosArrays;

import java.util.Scanner;

public class EJERCICIOSS7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("cuantos numero vas a escribir?");
		Integer cantidad = sc.nextInt();
		Integer contador = 0;
		Integer[] listanumeros = new Integer[cantidad];
		do {
			System.out.println("Di el numero");
			listanumeros[contador++] = sc.nextInt();
		} while (contador != cantidad);

		Integer vuelta = listanumeros.length;
		vuelta--;
		Integer[] listainvertida = new Integer[listanumeros.length];
		for (int i = 0, j = vuelta; i < listainvertida.length; i++, j--) {
			listainvertida[i] = listanumeros[j];
		}

		for (int i = 0; i < listanumeros.length; i++) {
			System.out.println(listainvertida[i]);
			sc.close();
		}
	}
}
