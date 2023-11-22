package ejercicio1;

import java.util.Scanner;

public class Ejercicio3 {
	//preguntar la edad
	
	public static void main(String[] args) {
		
		System.out.println("¿Que edad tienes?");
		Scanner scanner = new Scanner(System.in);
		int edad = scanner.nextInt();
		scanner.close();
		
		System.out.println("Su edad es de " + edad + " años");
		
	}
}
