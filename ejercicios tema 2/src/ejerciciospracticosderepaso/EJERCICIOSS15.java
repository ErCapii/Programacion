package ejerciciospracticosderepaso;

import java.util.Random;
import java.util.Scanner;

public class EJERCICIOSS15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		Integer aleatorio = random.nextInt(0, 10);
		Integer numero;
		Integer puntuacion=10;
		do {
			System.out.println("Adivina el numero entre el 0 o el 9");
			numero = sc.nextInt();
		if (numero!=aleatorio) {
			puntuacion-=1;
		}
		
		} while (!(numero == aleatorio));
		System.out.println("Correcto el numero era "+ aleatorio + " tu puntuacion es "+puntuacion);
		sc.close();

	}
}

