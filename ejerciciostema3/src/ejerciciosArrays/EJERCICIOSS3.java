package ejerciciosArrays;

import java.util.Scanner;

//EJERCICIO 3
//Realizar un programa que solicite números al usuario, los almacene y luego los muestre en el
//mismo orden en el que fueron indicados. Para ello, en primer lugar, preguntaremos al usuario
//cuántos números nos va a decir. Y luego se los iremos solicitando uno a uno. Los iremos
//guardando en un array. Al terminar, le mostraremos la lista completa de números. 

public class EJERCICIOSS3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("cuantos numero vas a escribir?");
		Integer cantidad = sc.nextInt();
		Integer contador = 0;
		Integer[] listanumeros = new Integer[cantidad];
		do {
			System.out.println("Di el numero");
			listanumeros[contador++] = sc.nextInt();
		} while (contador != cantidad);
		for (int i = 0; i < listanumeros.length; i++) {
			System.out.println(listanumeros[i]);
			sc.close();
		}
	}
}
