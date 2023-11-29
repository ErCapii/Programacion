package pruebas;

import java.util.Scanner;

public class irpf {
	public static void main(String[] args) {

		// Escribe un programa que calcule el impuesto sobre la renta en función del
		// ingreso
		// anual de una persona. Utiliza estructuras if-else
		// anidadas para aplicar diferentes tasas impositivas según el nivel de
		// ingresos.

		System.out.println("Cuanto ingresas al año?");
		Scanner sc = new Scanner(System.in);
		double cantidad = sc.nextDouble();
		sc.close();
		if (cantidad <= 12450) {
			System.out.println("Tu retencion seria del 19%");
		} else if (cantidad >= 12451 || 20199 <= cantidad) {
			System.out.println("Tu retencion seria del 24%");
		} else if (cantidad >= 20200 || 35199 <= cantidad) {
			System.out.println("Tu retencion seria del 30%");
		} else if (cantidad >= 35200 || 59999 <= cantidad) {
			System.out.println("Tu retencion seria del 37%");
		} else if (cantidad >= 60000 || 299999 <= cantidad) {
			System.out.println("Tu retencion seria del 45%");
		} else if (cantidad >= 300000) {
			System.out.println("Tu retencion seria del 47%");
		}

	}
}
//Hasta 12.450 euros | Retención del 19%
//Desde 12.450 hasta 20.199 euros | Retención del 24%
//Desde 20.200 hasta 35.199 euros |Retención del 30%
//Desde 35.200 hasta 59.999 euros | Retención del 37%
//Desde 60.000 hasta 299.999 | Retención del 45%
//Más de 300.000 euros | Retención del 47%