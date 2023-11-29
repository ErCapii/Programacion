package ejercicios;

public class ejercicios16 {
	public static void main(String[] args) {

		Integer suma = 0;
		Integer valor = 1;
		
		while (valor <=10000) {
			suma = suma + valor;
			valor++;
		}

		System.out.println(suma);
	}
}

