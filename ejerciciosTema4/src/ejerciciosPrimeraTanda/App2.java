package ejerciciosPrimeraTanda;


public class App2 {

	public static void main(String[] args) {
		String[] palabras = {"azul","rojo","negro","blanco" };
		ArrayUtils.imprimirArray(palabras);
		System.out.println(ArrayUtils.obtenerPalabra(palabras, 3));
		System.out.println(ArrayUtils.buscarPalabra(palabras, "blanco"));
	}

}

