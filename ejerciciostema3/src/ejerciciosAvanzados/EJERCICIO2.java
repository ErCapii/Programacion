package ejerciciosAvanzados;

import java.util.Scanner;

public class EJERCICIO2 {
	public static void main(String[] args) {
		// System.out.println(" | | ");
		// System.out.println("---|---|---");
		// System.out.println(" | | ");
		// System.out.println("---|---|---");
		// System.out.println(" | | ");

		Scanner sc = new Scanner(System.in);
		Integer salto = 1;
		Integer contadorPalo = 0;
		System.out.println("jugador 1 juega con X");
		System.out.println("jugador 2 juega con O");
		Boolean salir = true;
		Integer sumaposicion = 0;
		Integer[] ocupada = new Integer[9];
		Integer posicion1 = 0;
		Integer posicion2 = 0;
		Integer uno = 1;
		Integer cinco = 2;
		Integer nueve = 3;
		String[][] tablero1 = tablero();
		
		do {
			do {
				System.out.println("Jugador 1 di la posicion ");
				posicion1 = sc.nextInt();
				System.out.println("Jugador 2 di la posicion ");
				posicion2 = sc.nextInt();
				salto = 1;
				for (int l = 0; l < ocupada.length; l++) {
					if (posicion1 == ocupada[l] || posicion2 == ocupada[l]) {
						System.out.println("posicion ocupada elige otra");
						salir = true;
						break;
					} else {
						salir = false;
						ocupada[sumaposicion] = posicion1;
						sumaposicion++;
						ocupada[sumaposicion] = posicion2;
						break;
					}

				}
			} while (salir);
			uno = 1;
			cinco = 2;
			nueve = 3;
			for (int fila = 0; fila < tablero1.length; fila++) {
				salto++;
				contadorPalo = 0;
				for (int columna = 0; columna < tablero1[fila].length; columna++) {
					Integer resto = salto % 2;
					if (resto == 0) {
						if (columna == 1 && posicion1 == uno) {
							tablero1[fila][columna] = "X";
							contadorPalo++;
						} else if (columna == 5 && posicion1 == cinco) {
							tablero1[fila][columna] = "X";
							contadorPalo++;
						} else if (columna == 9 && posicion1 == nueve) {
							tablero1[fila][columna] = "X";
							contadorPalo++;
						} else if (columna == 1 && posicion2 == uno) {
							tablero1[fila][columna] = "O";
							contadorPalo++;
						} else if (columna == 5 && posicion2 == cinco) {
							tablero1[fila][columna] = "O";
							contadorPalo++;
						} else if (columna == 9 && posicion2 == nueve) {
							tablero1[fila][columna] = "O";
							contadorPalo++;
						}
					}
				}
				Integer resto = salto % 2;
				if (resto == 0) {
					if (uno == 1) {
						uno = 4;
						cinco = 5;
						nueve = 6;
					} else if (uno == 4) {
						uno = 7;
						cinco = 8;
						nueve = 9;
					}
				}
			}
			for (int fila = 0; fila < tablero1.length; fila++) {
				for (int columna = 0; columna < tablero1[fila].length; columna++) {
					System.out.print(tablero1[fila][columna]);
				}
				System.out.println();
			}
		} while (true);
	}

	public static String[][] tablero() {
		int contadorPalo = 0;
		String[][] tablero = new String[5][11];
		int salto = 1;
		for (int fila = 0; fila < tablero.length; fila++) {
			salto++;
			contadorPalo = 0;

			for (int columna = 0; columna < tablero[fila].length; columna++) {

				Integer resto = salto % 2;
				if (contadorPalo == 3) {
					tablero[fila][columna] = "|";
					contadorPalo = 0;
				} else if (resto == 0) {

					tablero[fila][columna] = " ";
					contadorPalo++;
				} else {
					tablero[fila][columna] = "-";
					contadorPalo++;
				}
			}
		}
		return tablero;
	}
}
