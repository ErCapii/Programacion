package ejerciciosPrimeraTanda;

import java.util.Random;

public class calculadora {
	public static void main(String[] args) {
		Random rm = new Random();
		Integer numero1 = rm.nextInt(0, 11);
		Integer numero2 = rm.nextInt(0, 11);
		Integer sumas = sumar(numero1, numero2);
		Integer restas = restar(numero1, numero2);
		Integer divisiones = dividir(numero1, numero2);
		Integer multiplicaciones = multiplicar(numero1, numero2);
	}

	public static Integer sumar(Integer uno, Integer dos) {
		Integer sumas = uno + dos;
		return sumas;
	}

	public static Integer restar(Integer uno, Integer dos) {
		Integer restas=uno-dos;
		return restas;
	}
	public static Integer dividir(Integer uno, Integer dos) {
		Integer divisiones=uno/dos;
		return divisiones;
	}
	public static Integer multiplicar(Integer uno, Integer dos) {
		Integer multiplicaciones=uno*dos;
		return multiplicaciones;
	}
	public static String calcular() {
	
	return null;
	}
}