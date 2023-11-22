package CEU.Tema2;

import java.util.Scanner;

public class DEPURACION3MAL {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer multiplo = 1;
		Integer fijo = 1;
		Integer resultado = 0;

		for (; (fijo == 0);) {
			System.out.println("Dime un numero entre el 1 y el 9");
			fijo = sc.nextInt();
			if (fijo < 10 || 0 < fijo) {
				System.out.println("Valor incorrecto");
			} else if (fijo == 0) {
				System.out.println("Adios");
			} else {
				for (Integer valor = 1; valor < 10; valor++) {
					multiplo = fijo + valor;
					resultado = resultado + multiplo;

					if (valor <= 9) {
						System.out.print(multiplo + " + ");
					} else
						System.out.print(multiplo + " = " + resultado);
				}
			}
			System.out.println();
			sc.close();
		}
	}

}
