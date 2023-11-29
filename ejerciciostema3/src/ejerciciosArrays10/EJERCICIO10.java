package ejerciciosArrays10;

import java.util.Scanner;

public class EJERCICIO10 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Cuantos numeros fibonacci quieres");
	Integer fibo=sc.nextInt();
	Integer[] fibonacci= new Integer[fibo];
	fibonacci[0]=0;
	fibonacci[1]=1;
	for (int i = 2; i < fibonacci.length; i++) {
		fibonacci[i]= fibonacci[i-1] + fibonacci[i-2];
		
		
	}
	for (Integer numero: fibonacci) {
		System.out.print(numero+" ");
	}
}
	
}

// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144