package ejerciciospracticosderepaso;

import java.util.Scanner;

public class EJERCICIOS4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el valor de la compra");
		double precio = sc.nextInt();
		System.out.println("Dime la cantidad de productos que compras");
		double compra = sc.nextInt();

		double subtotal = precio * compra;

		if (compra > 100) {
			double descuento = subtotal * 0.40;
			System.out.println("El precio con el descuento aplicado seria " + (subtotal - descuento));
		} else if (compra >= 25 && 100 >= compra) {
			double descuento = subtotal * 0.20;
			System.out.println("El precio con el descuento aplicado seria " + (subtotal - descuento));
		} else if (compra >= 10 && 24 >= compra) {
			double descuento = subtotal * 0.10;
			System.out.println("El precio con el descuento aplicado seria " + (subtotal - descuento));
		} else 
			System.out.println("El precio con el descuento aplicado seria " + subtotal);
	sc.close();
	}
}
