package ejerciciosPrimeraTanda;

public class ArrayUtils {

	public static void imprimirArray(String[] array) {
		for (String cadena : array) {
			System.out.print(cadena + " ");
		}
		System.out.println();
	}
	
	public static String obtenerPalabra(String[] array, Integer n) {
		if (n >= 0 && n < array.length) {
			return array[n];
		}
		return "";
	}
	
	public static Integer buscarPalabra(String[] array, String palabra) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(palabra)) {
				return i;
			}
		}
		return -1;
	}
	public static void recursiva(String[] array, Integer posicion) {
		String palabra=array[posicion];
		System.out.print(palabra);
		if (posicion < array.length-1) {
			recursiva(array,posicion+1);
		}
	}

}	

