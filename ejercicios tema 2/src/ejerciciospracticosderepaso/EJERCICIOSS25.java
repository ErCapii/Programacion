package ejerciciospracticosderepaso;

import java.util.Random;
import java.util.Scanner;

public class EJERCICIOSS25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
		String ppt;
		String resultado="";
		boolean pasa = true;

		do {
			System.out.println("Piedra, papel, tijera... un, dos, tres... ya!!");
			ppt = sc.nextLine();
			if (!ppt.equalsIgnoreCase("piedra") && !ppt.equalsIgnoreCase("papel") && !ppt.equalsIgnoreCase("tijera")) {
				System.out.println("Escribe bien");
			} else
				pasa = false;

		} while (pasa);

		switch (rm.nextInt(1, 4)) {
		case 1:
			resultado = "piedra";
			break;
		case 2:
			resultado = "papel";
			break;
		case 3:
			resultado = "tijera";
			break;
		}
		System.out.println(resultado);
		if (resultado.equals(ppt)) {
			System.out.println("empate");
		} else if (ppt.equals("piedra") && resultado.equals("papel")
				|| ppt.equals("papel") && resultado.equals("tijera")
				|| ppt.equals("papel") && resultado.equals("tijera")) {
			System.out.println("pierdes");
		} else {
			System.out.println("ganas");
		}
		sc.close();
	}

}
