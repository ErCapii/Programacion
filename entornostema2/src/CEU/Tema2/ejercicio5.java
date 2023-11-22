package CEU.Tema2;

import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args) {
		// Determinar si un número es par o impar

		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un número");
		Integer numero = scanner.nextInt();

		if (esPar(numero)) {
			System.out.println(numero + " es un número par.");
		} else {
			System.out.println(numero + " es un número impar.");
		}

		// Calcular la suma de los primeros 5 números naturales
		int suma = calcularSuma();
		System.out.println("La suma de los primeros 5 números naturales 1+2+3+4+5  es: " + suma);

		// Sumar los digitos del año 2023
		String anio = "2023";
		Integer sumaAnyo = sumarDigitos(anio);
		System.out.println("2+0+2+3 = " + sumaAnyo);
		scanner.close();
	}

	// Función para verificar si un número es par
	public static boolean esPar(int numero) {
		return numero % 2 == 0;
	}

	// Función para calcular la suma de los primeros 5 números naturales
	public static int calcularSuma() {
		int suma = 1;
		for (int i = 2; i <= 5; i++) {
			suma = suma + i;
		}
		return suma;
	}

	// Función que suma los dígitos de un año
	public static int sumarDigitos(String anio) {

		Integer suma = 0;
		for (int i = 0 ; i <= anio.length()- 1; i++) {
			suma=suma+ Integer.parseInt(anio.substring(i, i + 1));
		}
		anio=suma.toString();
		
		return suma;

	}

}
