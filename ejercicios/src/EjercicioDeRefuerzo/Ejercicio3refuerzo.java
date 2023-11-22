package EjercicioDeRefuerzo;

import java.util.Scanner;

public class Ejercicio3refuerzo {
	public static void main(String[] args) {
		System.out.println("Dime 1 numero entero");
		Scanner scan = new Scanner(System.in);
		String numero1 = scan.nextLine();
		System.out.println("Dime otro numero entero");
		
		String numero2 = scan.nextLine();	
		
		Long x1 = Long.parseLong(numero1);
		Long x2 = Long.parseLong(numero2);
		Long multi = x1*x2;
		scan.close();
		System.out.println(multi);
		
		
	}
}
