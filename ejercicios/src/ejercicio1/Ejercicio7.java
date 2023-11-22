package ejercicio1;

import java.util.Scanner;

public class Ejercicio7 {
	//calcular imc
	public static void main(String[] args) {
		
		System.out.println("cuanto mides?");
		Scanner scanner = new Scanner(System.in);
		double altura = scanner.nextDouble();
		System.out.println("y cuanto pesas?");
		double peso = scanner.nextDouble();
		double imc = (peso)/(altura*altura);
	
		scanner.close();
		
		System.out.println("Tu imc es "+ imc);
				
		
	}
}
