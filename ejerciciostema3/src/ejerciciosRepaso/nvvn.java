package ejerciciosRepaso;

public class nvvn {
public static void main(String[] args) {
	String frase ="solo-se-que-no-se-nada";
	String palabra="se";
	Integer index = frase.indexOf(palabra);
	String subcadena = frase.substring(palabra.length(), index);
	System.out.println(subcadena);
}
}
