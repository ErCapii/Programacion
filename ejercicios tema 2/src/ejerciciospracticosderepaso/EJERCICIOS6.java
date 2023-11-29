package ejerciciospracticosderepaso;

public class EJERCICIOS6 {
	public static void main(String[] args) {
		
		Integer resultado = 0;
		for (Integer valor=3; valor <= 30; valor=valor+3) {
			resultado = resultado + valor;

			if (valor <30) {
				System.out.print(valor + " + ");
			} else
				System.out.print(valor + " = " + resultado);
		}
	}

}
