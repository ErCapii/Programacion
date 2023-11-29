package ejerciciosPrimeraTanda;

import java.util.Random;

public class ejercicio3 {
public static void main(String[] args) {
	Random rm= new Random();
	Integer numero=rm.nextInt(1,3);
	String palabra=" HOLA como ESTAS ";
	String get=getMayMin(numero,palabra);
	System.out.println(get);
}
public static String getMayMin(Integer numero, String hola) {
	if(numero==1) {
		hola=hola.toUpperCase();
		hola=hola.trim();
	}else {
		hola=hola.toLowerCase();
		hola=hola.trim();
	}
	
	return hola;
}
}
