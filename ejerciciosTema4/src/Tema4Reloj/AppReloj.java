package Tema4Reloj;

import java.util.Scanner;

public class AppReloj {
	public static void main(String[] args) {
		Reloj reloj = new Reloj();
		System.out.println(reloj);
		Scanner sc = new Scanner(System.in);
		System.out.println("Hora");
		Integer hora = sc.nextInt();
		System.out.println("Minutos");
		Integer minutos = sc.nextInt();
		System.out.println("Segundos");
		Integer segundos = sc.nextInt();
		reloj.ponerEnHora(hora, minutos, segundos);
		System.out.println(reloj);
		reloj.setFormato24Horas(false);
		System.out.println(reloj);
		reloj.ponerEnHora(24, 17);
		System.out.println(reloj);
		reloj.ponerEnHora(21, 82);
		System.out.println(reloj);
		reloj.ponerEnHora(17, 16, 15);
		System.out.println(reloj);
		Reloj reloj2 = new Reloj(17, 16, 15);
		if (reloj.equals(reloj2)) {
			System.out.println("si son iguales");
		} else
			System.out.println("No son iguales");
		sc.close();
	}
}
