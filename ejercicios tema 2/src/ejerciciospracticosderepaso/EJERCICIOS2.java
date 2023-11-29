package ejerciciospracticosderepaso;

import java.util.Scanner;

public class EJERCICIOS2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una ciudad");
		String ciudad1 = sc.nextLine();
		System.out.println("Dime otra ciudad");
		String ciudad2 = sc.nextLine();
		System.out.println("Dime otra ciudad");
		String ciudad3 = sc.nextLine();

		Integer longitud1 = ciudad1.length();
		Integer longitud2 = ciudad2.length();
		Integer longitud3 = ciudad3.length();
		String primero = "";
		String segundo = "";
		String tercero = "";

		if (longitud1 > longitud2 && longitud3 < longitud1) {
			tercero = ciudad1;

		} else if (longitud1 < longitud2 && longitud3 < longitud1) {
			segundo = ciudad1;

		} else if (longitud1 < longitud3 && longitud2 < longitud1) {
			segundo = ciudad1;

		} else {
			primero = ciudad1;
		}
		if (longitud2 > longitud1 && longitud3 < longitud2) {
			tercero = ciudad2;

		} else if (longitud2 < longitud1 && longitud3 < longitud2) {
			segundo = ciudad2;

		} else if (longitud2 < longitud3 && longitud1 < longitud2) {
			segundo = ciudad2;

		} else {
			primero = ciudad2;
		}
		if (longitud3 > longitud2 && longitud1 < longitud3) {
			tercero = ciudad3;

		} else if (longitud3 < longitud2 && longitud1 < longitud3) {
			segundo = ciudad3;

		} else if (longitud3 < longitud1 && longitud2 < longitud3) {
			segundo = ciudad3;

		} else {
			primero = ciudad3;
		}
		System.out.println(primero);
		System.out.println(segundo);
		System.out.println(tercero);
		sc.close();
	}

}
