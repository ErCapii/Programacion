package ejerciciosPrimeraTanda;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime dos números");
		Integer a = sc.nextInt();
		Integer b = sc.nextInt();
		sc.nextLine();
		System.out.println("Suma: " + Calculadora.sumar(a,b));
		System.out.println("Resta: " + Calculadora.restar(a,b));
		System.out.println("Multiplicación: " + Calculadora.multiplicar(a,b));
		System.out.println("División: " + Calculadora.dividir(a,b));

		System.out.println("Qué quieres hacer con ellos? (ADD, SUB, MUL, DIV)");
		String operacion = sc.nextLine();
		System.out.println("Resultado: " + Calculadora.calcular(operacion, a, b));

		sc.close();
	}
	
	
	
	
	
	
	
}

