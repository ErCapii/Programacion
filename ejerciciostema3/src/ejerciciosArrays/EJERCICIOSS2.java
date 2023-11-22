package ejerciciosArrays;

//EJERCICIO 2
//Realizar un programa que solicite un número al usuario. Después, guardar en un array el
//cuadrado de ese número y de los 5 siguientes.
//Al terminar, mostrar el contenido del array por consola. 

import java.util.Scanner;

public class EJERCICIOSS2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero");
		Integer numero = sc.nextInt();
		Integer posicion = 0;

		Integer[] cuadrado = new Integer[numero + 5];

		for (; numero <= cuadrado.length;numero++) {
			cuadrado[posicion++] = numero * numero;
			
		}
		for (int i = 0; i < cuadrado.length; i++) {
			System.out.println(cuadrado[i]);
			sc.close();
		}
	}
}
