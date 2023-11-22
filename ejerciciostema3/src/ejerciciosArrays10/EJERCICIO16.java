package ejerciciosArrays10;

public class EJERCICIO16 {
public static void main(String[] args) {
	String palabra= "indonesia";
	String[] letras= new String[palabra.length()];
	letras=palabra.split("");
	for (int i = 0, fin=palabra.length()-1; i < fin; i++, fin--) {
		String aux= letras[i];
		letras[i]=letras[fin];
		letras[fin]=aux;
	}
	for (String string : letras) {
		System.out.print(string);
	}
	
}
}
