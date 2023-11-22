package ejerciciosArrays10;

public class EJERCICIO11 {
	public static void main(String[] args) {
		Integer[][] bi = new Integer[5][10];
		Integer suma=1;
		for (int fila = 0; fila < bi.length; fila++) {
			for (int columna = 0; columna < bi[fila].length; columna++) {
				bi[fila][columna]=suma;
				suma++;
				Integer resultado = bi[fila][columna];
				System.out.print(resultado + " ");
			}
			System.out.println();
		}
	}
}
