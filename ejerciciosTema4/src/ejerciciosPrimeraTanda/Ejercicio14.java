package ejerciciosPrimeraTanda;

public class Ejercicio14 {
public static void main(String[] args) {
	String frase="hola como estas";
	String[] array= frase.split("");
	ArrayUtils.recursiva(array, 0);
}
}
