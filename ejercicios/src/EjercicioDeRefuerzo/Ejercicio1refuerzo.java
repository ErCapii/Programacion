package EjercicioDeRefuerzo;

import java.util.Scanner;
	//pide el radio y calcula el radio y la circunferencia 
public class Ejercicio1refuerzo {
	
	public static final Double PI = 3.1425;
	
	public static void main(String[] args) {
		System.out.println("dime el radio de un círculo");
		
		Scanner scan = new Scanner(System.in);
		Double radio = scan.nextDouble();
		Double area = PI*(radio*radio);
		Double circunferencia = radio*(PI*PI);
		scan.close();
		
		
		System.out.println("la cicunferencia es "+ circunferencia+ " y la area es "+ area);
	}
}
