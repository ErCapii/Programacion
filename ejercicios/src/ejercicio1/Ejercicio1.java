package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	//unir nomre y apellido

	public static void main(String[] args) {
		
		System.out.println("Cual es tu nombre de usuario?"+ " ");
		Scanner scanner = new Scanner(System.in);
		
		String nombre = scanner.nextLine();
		
		
		System.out.println("y cual es tu apellido?" + " ");
		
		
		String apellido = scanner.nextLine();
		
		scanner.close();
		
		System.out.println("Su nombre completo es "+ nombre + " " + apellido);
		
		
		
		
		
		
		
		
	}
}
