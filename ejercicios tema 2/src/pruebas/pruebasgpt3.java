package pruebas;

import java.util.Scanner;

public class pruebasgpt3 {
public static void main(String[] args) {
	//lee 3 numeros e identifica cual de ellos es mayor
	
	System.out.println("Dime un numero");
	Scanner sc = new Scanner(System.in);
	Integer numero1 = sc.nextInt();
	System.out.println("Dime otro numero");
	Integer numero2 = sc.nextInt();
	System.out.println("Dime otro mas numero");
	Integer numero3 = sc.nextInt();
	
	sc.close();
	if (numero1>numero2 && numero3<numero1) {
		System.out.println(numero1+ " es el mayor");
	}else if (numero2>numero1 && numero3<numero2) {
		System.out.println(numero2+ " es el mayor");
	}else if (numero3>numero2 && numero1<numero3) {
		System.out.println(numero3+ " es el mayor");
	}
	
	
	
	
}
}
