package ejercicios;

import java.util.Scanner;

public class ejercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer numero;
		Integer suma = 0;
		do {
			System.out.println("Dame un número");
			numero = sc.nextInt();
			suma = suma + numero;
		} while (numero != 0);

		System.out.println("La suma es: " + suma);

		sc.close();

	}
}
