package ejerciciosArrays10;

import java.util.Scanner;

public class EJERCICIO15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String web;
		Integer sep;
		Integer punto2;
		Integer punto1; 
		
		do {
		System.out.println("Dame una direccion web");
		web = sc.nextLine();
		if (!web.contains(".") || !web.startsWith("http://") && !web.startsWith("https://")) {
			System.out.println("Error");
		}
		}while (!web.contains(".") || !web.startsWith("http://") && !web.startsWith("https://"));
		String[] barra = web.split("://");
		String[] puntos = web.split(".");
		
		for (String bar : barra) {
			System.out.println(bar);
		}
		for (String punto : puntos) {
			System.out.println(punto);
		}
		
		
		sc.close();
	}
}