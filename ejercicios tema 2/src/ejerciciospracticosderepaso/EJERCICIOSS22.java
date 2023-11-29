package ejerciciospracticosderepaso;

import java.util.Scanner;

public class EJERCICIOSS22 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Integer numero=0;
	String cadena="";
	System.out.println("Pulsa enter para comenzar");
	
	do {
		System.out.print("");
		cadena=sc.nextLine();
		if (cadena.isEmpty()) {
		numero++;
		System.out.println(numero);
		}else 
			System.out.println("solo pulsar enter");
		
		
	}while (numero!=10);
	sc.close();
}
}
