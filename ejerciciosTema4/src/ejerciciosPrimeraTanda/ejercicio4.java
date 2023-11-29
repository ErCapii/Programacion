package ejerciciosPrimeraTanda;

import java.util.Random;

public class ejercicio4 {
	public static void main(String[] args) {
		Random rm = new Random();
		Integer numero = rm.nextInt(1, 3);
		String palabra = " HOLA como ESTAS ";
		String texto=getMinMay(numero,palabra);
		System.out.println(texto);
	}

	public static String getMinMay(Integer numero, String palabra) {
		
		if (numero == 1) {
		return ejercicio2.getMinusculas(palabra);
		} else
		return ejercicio1.getMayusculas(palabra);
	}

	
}


