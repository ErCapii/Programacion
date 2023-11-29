package ejerciciosArrays10;

import java.util.Scanner;

public class EJERCICIO22 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("dame una palabra");
		String palabra=sc.nextLine();
		String[] dividida=palabra.split("");
		
		for (String string : dividida) {
			System.out.print(string+" ");
		}
	}
}
