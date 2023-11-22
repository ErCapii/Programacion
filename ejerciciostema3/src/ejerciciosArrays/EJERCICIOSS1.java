package ejerciciosArrays;
// EJERCICIO 1

//Realizar un programa que guarde en un array todos los números pares entre 1 y 30. Después,
//mostrar el contenido del array por consola. 

public class EJERCICIOSS1 {
	public static void main(String[] args) {
		Integer[] numeros = new Integer[15];
		Integer posicion = 0;

		for (Integer contador = 1; contador <= 30;) {
			Integer pares = contador % 2;
			if (pares == 0) {
				numeros[posicion++] = contador;
			}
			contador++;
		}
	//	for (int j = 0; j < numeros.length; j++) {
	//		System.out.println(numeros[j]);

	//	}
		for (Integer numero : numeros) {
			System.out.println(numero);
		}
	}
}
