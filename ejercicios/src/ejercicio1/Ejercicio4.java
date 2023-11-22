package ejercicio1;

import java.util.Scanner;

public class Ejercicio4 {
	//edad segun el año
	
	public final static Integer AÑO_ACTUAL = 2023;
	
	public static void main(String[] args) {
		
		System.out.println("Cual es tu año de nacimiento");
		Scanner scanner = new Scanner(System.in);
			int año = scanner.nextInt();
		System.out.println("Su edad segun tu año es "+ (AÑO_ACTUAL - año));
		scanner.close();
			
	}
}
