package ejercicios;

import java.util.Scanner;

public class ejercicios20 {
	public static void main(String[] args) {

		Integer horizontal = 1;
		Integer vertical = 1;
		Integer numeroh = 1;
		String sysohorizontal1 = "";

		for (; horizontal <= 5; horizontal++) {
			numeroh = horizontal;
			sysohorizontal1 += " " + numeroh + " "; //esto guarda el las sumas una despues de otra 1 2 3 4 

		}

		for (; vertical <= 5; vertical++) {
			System.out.println(" " + sysohorizontal1 + " ");
		}
	}
}
