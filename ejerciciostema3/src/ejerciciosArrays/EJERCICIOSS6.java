package ejerciciosArrays;

import java.util.Scanner;

public class EJERCICIOSS6 {
public static void main(String[] args) {
	String[] palabras =new String[3];
	Scanner sc = new Scanner(System.in);
	
	for (int  contador= 0;  contador< palabras.length; contador++) {
		System.out.println("Dime una palabra");
		palabras[contador]=sc.nextLine();
	}
	for (int i = 0; i < palabras.length; i++) {
		System.out.print(palabras[i]+" ");
		sc.close();
	}
}
}
