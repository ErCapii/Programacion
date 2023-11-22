package ejerciciosArrays10;

import java.util.Scanner;

public class EJERCICIO18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame una secuencia de numeros ");
		Integer numeros = sc.nextInt();
		String cantidadstr = Integer.toString(numeros);
		String[] nm = new String[cantidadstr.length()];
		Integer contador = 0;
		nm = cantidadstr.split("");
		Boolean iguales= true;
		for (int i = 0, x = nm.length - 1; i < nm.length; i++, x--) {
			if (!nm[i].equals(nm[x])) {
				iguales=false;
				break;
			}
		}
		if (iguales) {
			System.out.println("Es capicua");
		} else
		System.out.println("No es capicua");
		sc.close();
	}
}
