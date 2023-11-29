package ejercicios;

import java.util.Scanner;

public class ejercicios19 {
	public static void main(String[] args) {

		System.out.println("cual es el precio sin iva?");
		Scanner scanner = new Scanner(System.in);
		Double precio = scanner.nextDouble();
		System.out.println("cual es el % del iva?");
		Integer tipodeiva = scanner.nextInt();
		
		
		Double calculoIVA;
		Double precioconiva;
			
		
		switch (tipodeiva) {
		
		case 21:
			calculoIVA = (precio * 21) / 100;
			precioconiva = precio + calculoIVA;
			System.out.println("El precio con IVA es " + precioconiva);
			break;
		case 10:
			calculoIVA = (precio * 10) / 100;
			precioconiva = precio + calculoIVA;
			System.out.println("El precio con IVA es " + precioconiva);
			break;
		case 4:
			calculoIVA = (precio * 4) / 100;
			precioconiva = precio + calculoIVA;
			System.out.println("El precio con IVA es " + precioconiva);
			break;
		case 0:
			calculoIVA = 0.0;
			precioconiva = precio + calculoIVA;
			System.out.println("El precio con IVA es " + precioconiva);
			break;
		default:
			System.out.println("El valor de IVA proporcionado no es válido.");
			
		}
		scanner.close();
	}
}
