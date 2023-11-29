package ejercicios;

import java.util.Scanner;

public class ejercicio9 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	String nm;
	
	System.out.println("Dime tu nombre completo");
	nm = sc.nextLine();
	Integer posicion = nm.indexOf(" ");
	String nombre = nm.substring(0, posicion);
	Integer posicion2 = nm.lastIndexOf(" ");
	String apellido = nm.substring(posicion, posicion2);
	String apellido2 = nm.substring(posicion2);
	
	System.out.println("tu nombre es "+ nombre+ " tu primer pellido es"+apellido+" tu segundo apellido es" + apellido2);
	sc.close();
}
}
