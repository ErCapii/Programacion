package ejercicios;

import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {

		// calcular imc ejercicio 7 tema 1
		System.out.println("cuanto mides en metros?");
		Scanner scanner = new Scanner(System.in);
		Double altura = scanner.nextDouble();
		System.out.println("y cuanto pesas en kg?");
		Double peso = scanner.nextDouble();
		Double imc = (peso) / (altura * altura);

		scanner.close();

		System.out.println("Tu imc es " + imc);

		// calcular si tiene sobrepeso o no

		Boolean PesoInferiorNormal = imc < 18.5;
		Boolean PesoNormal = (imc >= 18.5 && imc < 24.9);

		Boolean PesoSuperior = (imc >= 25 && imc < 29.9);
		Boolean Sobrepeso = imc > 30;

		if (PesoInferiorNormal) {
			System.out.println("tienes un peso inferior al normal");
		} else if (PesoNormal) {
			System.out.println("tienes un peso normal");
		} else if (PesoSuperior) {
			System.out.println("tienes un peso superior normal");
		} else if (Sobrepeso) {
			System.out.println("tienes obesidad");
		}
	}
}
