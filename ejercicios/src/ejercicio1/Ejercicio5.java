package ejercicio1;

import java.util.Scanner;

public class Ejercicio5 {
	//cuanto cobras al año
	public static void main(String[] args) {
		
		System.out.println("cuanto te gustaria ganar al año? ");
		Scanner scanner = new Scanner(System.in);
		double cantidad = scanner.nextDouble();
		
		double mensual = cantidad/12;
		scanner.close();
		
		
		System.out.println("tu sueldo mensual seria de " +mensual);
		
		
		
	}
}
