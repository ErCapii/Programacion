package ejerciciosArrays;

import java.util.Scanner;

public class EJERCICIOSS9 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("cuantos numero vas a escribir?");
		Integer cantidad = sc.nextInt();
		Integer contador = 0;
		Integer[] listadenumeros = new Integer[cantidad];
		Integer menor1 = 0;
		Integer x = 1;
		do {
			System.out.println("Di el numero " + x);
			x++;
			listadenumeros[contador++] = sc.nextInt();
		} while (contador != cantidad);

		Integer menor = listadenumeros[0];
		Integer mayor = listadenumeros[0];

		for (int i = 0; i < listadenumeros.length; i++) {
			if (listadenumeros[i] < menor) {
				menor = listadenumeros[i];
			}
			if (listadenumeros[i] > mayor) {
				mayor = listadenumeros[i];
			}
		}
		for (int i = 0, j = 1; (menor != listadenumeros[0] || mayor != listadenumeros[listadenumeros.length - 1]);) {

			if (listadenumeros[i] > listadenumeros[j]) {
				menor1 = listadenumeros[j];
				listadenumeros[j] = listadenumeros[i];
				listadenumeros[i] = menor1;
			}
			if (j == listadenumeros.length - 1) {
				i = 0;
				j = 1;
			} else {
				i++;
				j++;
			}

		}
		for (int j = 0; j < listadenumeros.length; j++) {
			System.out.print(listadenumeros[j] + " ");
			sc.close();
		}
	}
}
