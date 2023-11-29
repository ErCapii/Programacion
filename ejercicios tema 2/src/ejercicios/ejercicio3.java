package ejercicios;

import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args) {

		System.out.println("cual es el precio sin iva?");
		Scanner scanner = new Scanner(System.in);
		Double precio = scanner.nextDouble();
		System.out.println("cual es el % del iva?");
		Double tipoDeIva = scanner.nextDouble();
		scanner.close();
		double normal = 21;
		double reducido = 10;
		double superreducido = 4;
		double exento = 0;

		if (tipoDeIva == normal || tipoDeIva == reducido || tipoDeIva == superreducido || tipoDeIva == exento){

			double calculoIVA;

			if (tipoDeIva == normal) {
				calculoIVA = (precio * normal) / 100;
			} else if (tipoDeIva == reducido) {

				calculoIVA = (precio * reducido) / 100;
			} else if (tipoDeIva == superreducido) {
				calculoIVA = (precio * superreducido) / 100;
			} else {
				calculoIVA = 0.0; // Exento de IVA
			}

			double precioConIVA = precio + calculoIVA;
			System.out.println("El precio con IVA es " + precioConIVA);
		} else {
			System.out.println("El valor de IVA proporcionado no es válido.");
		}

	}
}
