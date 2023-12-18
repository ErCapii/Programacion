package ejerciciosPrimeraTanda;

public class Ejercicio13 {
public static void main(String[] args) {
	Integer resultado=factorial(10);
	System.out.println(resultado);
}
public static Integer factorial(Integer numero) {
	if (numero == 1) {
		return 1;
	}
	return  numero * factorial(numero-1);
}
}
