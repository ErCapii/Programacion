package ejerciciospracticosderepaso;

import java.util.Random;
import java.util.Scanner;

public class EJERCICIOSS26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
		String ppt = "";
		String resultado = "";
		Boolean pasa = true;
		Integer puntuacion = 0;
		Integer puntuacionbot = 0;
		Integer empate = 0;
		String salir;
		do {
			do {
				System.out.println("Piedra, papel, tijera... un, dos, tres... ya!!");
				ppt = sc.nextLine();
				if (!ppt.equalsIgnoreCase("piedra") && !ppt.equalsIgnoreCase("papel")
						&& !ppt.equalsIgnoreCase("tijera")) {
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
				empate++;
			} else if (ppt.equals("piedra") && resultado.equals("papel")
					|| ppt.equals("papel") && resultado.equals("tijera")
					|| ppt.equals("papel") && resultado.equals("tijera")) {
				System.out.println("pierdes");
				puntuacionbot++;
			} else {
				System.out.println("ganas");
				puntuacion++;
			}
			System.out.println("Quieres continuar (si/no)");
			salir = sc.nextLine();
			if (!salir.equalsIgnoreCase("si") && !salir.equalsIgnoreCase("no")) {
				System.out.println("responde si o no");
			}
		} while (salir.equalsIgnoreCase("si"));
		System.out.println("Tu puntuacion es " + puntuacion + " y la del bot es " + puntuacionbot
				+ " habeis quedado empate " + empate + " veces");
		sc.close();
	}

}
