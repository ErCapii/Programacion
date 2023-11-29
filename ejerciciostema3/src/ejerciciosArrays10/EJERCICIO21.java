package ejerciciosArrays10;

public class EJERCICIO21 {
	public static void main(String[] args) {
		Double resultado=0.0;
		Double[] numeros= new Double[]{5.4,3.1,9.0,4.7};
		for (Double double1 : numeros) {
			System.out.println(double1);
		}
		for (Double double1 : numeros) {
			resultado=resultado+double1;
		}
		System.out.println(resultado);
	}
}


