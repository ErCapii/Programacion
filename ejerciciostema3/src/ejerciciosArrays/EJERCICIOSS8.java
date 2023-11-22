package ejerciciosArrays;
//EJERCICIO 8

//Partiendo del ejercicio 3, cambia el orden de todos los datos para darle la vuelta al array. Es
//decir, lo que estaba al principio del array tendrá que estar al final, y viceversa. Al terminar,
//muestra el contenido del array por consola.
//NOTA: El ejercicio es igual al anterior (el ejercicio 7), pero ahora no queremos crear un nuevo
//array inverso, queremos invertir el que ya tenemos. 

import java.util.Scanner;

public class EJERCICIOSS8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("cuantos numero vas a escribir?");
		Integer cantidad = sc.nextInt();
		Integer contador = 0;
		Integer[] listanumeros = new Integer[cantidad];
		Integer vuelta = 0;
		Integer finish = listanumeros.length-1;
		Integer aux = 0;
		Integer x = 1;
		do {
			System.out.println("Di el numero " + x);
			x++;
			listanumeros[contador++] = sc.nextInt();
		} while (contador != cantidad);
		for (int principio = 0; finish >= principio; principio++, finish--) {
			vuelta = listanumeros[principio];
			aux = listanumeros[finish];
			listanumeros[finish] = vuelta;
			listanumeros[principio] = aux;
		}
		for (int j = 0; j < listanumeros.length; j++) {
			System.out.println(listanumeros[j]);
			sc.close();
		}
	}

}
