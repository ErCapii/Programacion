package ejercicios;

import java.util.Scanner;

public class ejercicios14 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Integer valor = 0;
	Integer multi= 0;
	Integer solucion;
	System.out.println("Dime un numero entero");
	valor = sc.nextInt();
	
while (multi<=10) {
	
	solucion = valor * multi;
	System.out.println(valor +" x "+ multi+ " = "+ solucion);
	multi +=1;
}
}
}
