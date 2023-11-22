package ejerciciosArrays;


import java.util.Scanner;

//EJERCICIO 4
//Modificar el programa anterior para que muestre la lista completa de números en orden
//inverso a como fueron introducidos por el usuario. 

public class EJERCICIOSS4 {
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
		cantidad--;
	
		for (Integer i = cantidad; i>=0; i--) {
			System.out.print(listanumeros[i]+" ");
			sc.close();
		}
	}

}
