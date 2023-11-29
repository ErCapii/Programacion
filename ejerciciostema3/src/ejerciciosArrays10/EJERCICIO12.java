package ejerciciosArrays10;

public class EJERCICIO12 {
	public static void main(String[] args) {
		Integer[][] bi = new Integer[10][10];
		Integer multi=0;
		for (int fila = 0; fila < bi.length; fila++) {
			for (int columna = 0; columna < bi[fila].length; columna++) {
				bi[fila][columna]=multi*columna;
				Integer resultado = bi[fila][columna];
				System.out.print(resultado + " ");
			}
			multi++;
			System.out.println();
		}
	}
}
