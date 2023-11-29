package pruebas;

import java.util.Scanner;

public class pruebasgpt2 {
public static void main(String[] args) {
	System.out.println("Dime un numero que sea positivo o negativo o igual a 0");
	
	Scanner sc = new Scanner(System.in);
	Integer numero = sc.nextInt();
	
	if (numero==0) {
		System.out.println("EL numero es igual a 0");
	}else if (numero>0){
		System.out.println("el numero es positivo");
	}else if (numero<0) {
		System.out.println("El numero es negatigo");
	}
	sc.close();
	
}
}
//solucion gpt
//        Scanner scanner = new Scanner(System.in);
//System.out.print("Ingrese un número: ");
//int numero = scanner.nextInt();

//if (numero > 0) {
//    System.out.println("El número es positivo.");
//} else if (numero < 0) {
//    System.out.println("El número es negativo.");
//} else {
//    System.out.println("El número es igual a cero.");
//}

//scanner.close();
