package ejerciciosArrays10;

import java.util.Scanner;

public class pruebas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contadorNotas = 0;
		int contadorNotasMayores = 0;
		System.out.println("Que nota buscas?");
		Integer notaBuscada = sc.nextInt();
		for (int i = 0; i < listaNotas.length; i++) {
			if (listaNotas[i] == notaBuscada) {
				contadorNotas++;
			}
			if (listaNotas[i] > notaBuscada) {
				contadorNotasMayores++;
			}
		}
		Integer[] posicionNota = new Integer[contadorNotas];
		for (int i = 0, j = 0; i < listaNotas.length; i++) {
			if (listaNotas[i] == notaBuscada) {
				posicionNota[j] = i + 1;
				j++;
			}
		}

		String notas = "";
		if (contadorNotas > 0) {
			for (int i = 0; i < posicionNota.length; i++) {
				notas = notas + posicionNota[i].toString() + " ";
			}
			System.out.println("La nota buscada existe y esta en la posicion/es " + notas + " y hay "
					+ contadorNotasMayores + " mayores a la indicada");
		} else {
			System.out.println("La nota buscada no existe");
		}

		System.out.println("Total de alumnos suspensos: " + suspensos);
		System.out.println("Nota media aprobados: " + aprobadosMedia);
	}
}
