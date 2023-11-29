package ejerciciosavanzados;

import java.util.Random;
import java.util.Scanner;

public class EJERCICIOSS7 {
	public static void main(String[] args) {
		Random rm = new Random();
		Scanner sc = new Scanner(System.in);
		Integer chinas =0;
		Integer chinasbot =0;
		Integer apuesta = 0;
		Integer apuestabot = 0;
		String seguir = "";
		Integer marcador = 0;
		Integer marcadorbot = 0;
		Integer empate = 0;

		do {
			do {
				System.out.println("Cuanto apuestas");
				apuesta = sc.nextInt();
				if (apuesta < 0 || 6 < apuesta) {
					System.out.println("No puede ser mayor que 6");
				}
			} while (apuesta > 6 && apuesta < 0);
			do {
				apuestabot = rm.nextInt(0, 7);
			} while (apuestabot == apuesta);
			System.out.println("el bot apuesta " + apuestabot);
			chinas=rm.nextInt(0, 4);
			chinasbot=rm.nextInt(0, 4);
			System.out.println("tu tienes " + chinas + " chinas" + " y el bot tiene " + chinasbot + " chinas");
			if (chinas < chinasbot) {
				System.out.println("Ha ganado el bot");
				marcadorbot=marcadorbot+apuesta;
			} else if (chinas == chinasbot) {
				System.out.println("empate");
				empate++;
			} else {
				System.out.println("Has ganado");
				marcador=marcador+apuestabot;
			}
			System.out.println("Quieres continuar responde si/no");
			sc.nextLine();
			seguir = sc.nextLine();
			
			

		} while (seguir.equalsIgnoreCase("si"));
		System.out.println("tu puntuacion a sido "+marcador+" puntos y la del bot a sido "+ marcadorbot+" puntos y en total habeis quedado empate "+ empate+ " veces");
		sc.close();
	}
}
