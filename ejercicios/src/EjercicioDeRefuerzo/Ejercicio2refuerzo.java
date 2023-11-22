package EjercicioDeRefuerzo;

import java.util.Scanner;
public class Ejercicio2refuerzo {
	public static void main(String[] args) {
		
		System.out.println("Dime 1 numero entero");
		Scanner scan = new Scanner(System.in);
		Long numero1 = scan.nextLong();
		System.out.println("Dime otro numero entero");
		
		Long numero2 = scan.nextLong();
		
		Long multi = numero1*numero2;
		scan.close();
		System.out.println(multi);
		
		
	}
	
	
	
}
