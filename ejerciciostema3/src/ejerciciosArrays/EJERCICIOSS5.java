package ejerciciosArrays;

import java.util.Scanner;

//ejercicio5
//Mejorar el programa anterior para que, además de mostrar la lista de números, calcule y
//muestre cuál es el máximo y el mínimo (y en qué posición están) y calcule la media de todos
//los números. Todo esto se debe hacer recorriendo el array. 
public class EJERCICIOSS5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("cuantos numero vas a escribir?");
		Integer cantidad = sc.nextInt();
		Integer contador = 0;
		Integer[] listadenumeros = new Integer[cantidad];
		Integer menor = 1;
		Integer mayor = 1;
		Integer posicionmenor = 0;
		Integer posicionmayor = 0;
		Integer media = 0;
		do {
			System.out.println("Di el numero");
			listadenumeros[contador++] = sc.nextInt();
		} while (contador != cantidad);
		for (int i = 0; i < listadenumeros.length; i++) {
			if (listadenumeros[i] < menor) {
				menor = listadenumeros[i];
				posicionmenor = i + 1;

			} else if (listadenumeros[i] > mayor) {
				mayor = listadenumeros[i];
				posicionmayor = i + 1;
			}
			for (int j = 0; j < listadenumeros.length; j++) {
				media = media + listadenumeros[j];
			}
			media = media / (listadenumeros.length);
		}
		System.out.println("el numero mayor es " + mayor + " y su posicion es " + posicionmayor + ", el menor es "
				+ menor + " y su posicion es " + posicionmenor + " y su media es " + media);
		sc.close();
	}
}
