package ejercicio1;

import java.util.Scanner;

public class Ejercicio2 {
	//conversacion basica

	public static void main(String[] args) {
		
		System.out.println("Cual es tu nombre de usuario?");
		Scanner scanner = new Scanner(System.in);
		String nombre = scanner.nextLine();
		System.out.println("Bienvenido"+" " + nombre);
		System.out.println("De donde eres?");
		String localidad = scanner.nextLine();
		System.out.println("Que tal se vive en"+" "+localidad+"?");
		String respuesta = scanner.nextLine();
		System.out.println("Gracias, Un saludo");
		
		scanner.close();
		
		
		
	}
}
