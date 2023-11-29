package ejerciciospracticosderepaso;

import java.util.Scanner;

public class EJERCICIOS1 {
	public static final Integer AñoActual = 2023;
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Cual es tu nombre?");
	String nombre = sc.nextLine();
	System.out.println("Cual es tu año de nacimiento?");
	Integer año = sc.nextInt();
	Integer edad = 2023-año;
	Integer diferencia= 2030-AñoActual;
	System.out.println("Hola "+ nombre+ ", en el año 2030 tendrás "+ (diferencia+edad)+" años");
	sc.close();
}
}
