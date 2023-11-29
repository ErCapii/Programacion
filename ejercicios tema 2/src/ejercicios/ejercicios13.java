package ejercicios;

import java.util.Scanner;

public class ejercicios13 {
public static void main(String[] args) {
	//
	Scanner sc = new Scanner(System.in);
	String texto;
	String cincoletras;
	Integer valor = 0;
	Integer valor2 = 5;
	
	
	System.out.println("Insertar Texto");
	texto = sc.nextLine();
	
	
	do {
		cincoletras = texto.substring(valor, valor2);
		System.out.println(cincoletras);
		valor+=5;
		valor2+=5;
	}while (false);
	
	
	
}
}
