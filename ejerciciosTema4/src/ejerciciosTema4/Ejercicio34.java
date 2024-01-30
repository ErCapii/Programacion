package ejerciciosTema4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio34 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	List<String> lista = new ArrayList<>();
	
	
	for (int i = 1; i < 6; i++) {
		System.out.println("cadena "+i);
		lista.add(sc.nextLine());
	}
	System.out.println(lista);
	for (int i = 0; i < lista.size(); i++) {
		String palabra = lista.get(i);
		lista.set(i, palabra.toUpperCase());
	}
	System.out.println(lista);
	Boolean vacia= lista.contains("");
	if (vacia) {
		System.out.println("Hay una cadena vacia");
	}
	
	for (Iterator<String> iterator = lista.iterator(); iterator.hasNext();) {
		String cadena = (String) iterator.next();
		
		if(cadena.length()<6) {
			iterator.remove();
		}
	}
	System.out.println(lista);
	}
	

}
