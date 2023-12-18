package ejerciciosPrimeraTanda;

public class Calculadora {

	public static final String SUMAR = "ADD";
	public static final String RESTAR = "SUB";
	public static final String DIVIDIR = "DIV";
	public static final String MULTIPLICAR = "MUL";
	
	
	public static Integer sumar(Integer num, Integer num2) {
		Integer resultado = num + num2;
		return resultado;
	}
	public static Integer restar(Integer num, Integer num2) {
		Integer resultado = num - num2;
		return resultado;
	}
	public static Integer multiplicar(Integer num, Integer num2) {
		Integer resultado = num * num2;
		return resultado;
	}
	public static Integer dividir(Integer num, Integer num2) {
		Integer resultado = num / num2;
		return resultado;
	}
	
	public static Integer calcular(String operacion, Integer a, Integer b) {
		switch (operacion) {
		case SUMAR:
			return sumar(a, b);
		case RESTAR:
			return restar(a, b);
		case MULTIPLICAR:
			return multiplicar(a, b);
		case DIVIDIR:
			return dividir(a, b);
		default:
			return null;
		}
	}
	
	
	
	
}
