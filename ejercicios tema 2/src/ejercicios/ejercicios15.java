package ejercicios;

import java.util.Scanner;

public class ejercicios15 {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer valor = 0;
		
		System.out.println("Dime un numero entero");
		 valor = sc.nextInt();
		
	for (Integer contador = 0; contador <=10; contador++) {
		
		Integer solucion = valor * contador;
		System.out.println(valor +" x "+ contador+ " = "+ solucion);
		
	}sc.close();
}
}
