package Tema4PilaColaCadenas;

import Tema4ColaCadenas.ColaCadenas;

public class App {
	public static void main(String[] args) {
		
		PilaCola<String> cadena = new PilaCola<>();
	System.out.println(cadena);
	cadena.añadirCadena("primera");
	cadena.añadirCadena("segunda");
	System.out.println(cadena);
	System.out.println(cadena.sacarCadena());
	cadena.añadirCadena("tercera");
	System.out.println(cadena);
	while(cadena.getTamaño()>0) {
		System.out.println(cadena.sacarCadena());
	}
	cadena.añadirCadena("cuarto");
	System.out.println(cadena);
	System.out.println(cadena.sacarCadena());
	
	cadena.setModoPila();
	System.out.println(cadena);
	cadena.añadirCadena("primera");
	cadena.añadirCadena("segunda");
	System.out.println(cadena);
	System.out.println(cadena.sacarCadena());
	cadena.añadirCadena("tercera");
	System.out.println(cadena);
	while(cadena.getTamaño()>0) {
		System.out.println(cadena.sacarCadena());
	}
	cadena.añadirCadena("cuarto");
	System.out.println(cadena);
	System.out.println(cadena.sacarCadena());
}
}