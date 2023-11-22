package ejerciciosAvanzados;

public class pruebas {
	public static void main(String[] args) {
		int contadorPalo = 0;
		String[][] tablero = new String[5][11];
		int salto = 1;
		for (int fila = 0; fila < tablero.length; fila++) {
			salto++;
			contadorPalo = 0;

			for (int columna = 0; columna < 11; columna++) {

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
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < 11; j++) {
				System.out.print(tablero[i][j]);
			}
			System.out.println();
		}
	}
}
