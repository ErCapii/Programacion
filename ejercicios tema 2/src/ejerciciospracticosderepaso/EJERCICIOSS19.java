package ejerciciospracticosderepaso;

import java.util.Scanner;

public class EJERCICIOSS19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer seleccion;
		double pesetas=166.386;
		double euros=0.006;
		double cantidad=0;
		do {
		System.out.println("1-Pasar de Pesetas a euros");
		System.out.println("2-Pasar de Euros a Pesetas");
		System.out.println("3- Salir");
		seleccion=sc.nextInt();
		
		switch (seleccion) {
		case 1: {
			System.out.println("Dime la cantidad");
			cantidad=sc.nextDouble();
			cantidad=cantidad*euros;
			System.out.println("Serian "+cantidad+" euros");
			break;
		}
		case 2: {
			System.out.println("Dime la cantidad");
			cantidad=sc.nextDouble();
			cantidad=cantidad*pesetas;
			System.out.println("Serian "+cantidad+" pesetas");
			break;
		}
		case 3: {
			System.out.println("Adio mu buena");
			break;
		}
		default:
			System.out.println("Numero no valido");
		}
		}while (!(seleccion==3));
		sc.close();
		}
	
}
