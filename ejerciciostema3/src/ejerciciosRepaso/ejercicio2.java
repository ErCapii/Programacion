package ejerciciosRepaso;

import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {
		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };
		Scanner sc = new Scanner(System.in);
		Integer suspensos = 0;
		Integer aprobadosMedia = 0;
		Integer aprobados = 0;
		for (int i = 0; i < listaNotas.length; i++) {
			if (listaNotas[i] < 5) {
				suspensos++;
			} else
				aprobados++;
		}
		for (int j = 0; j < listaNotas.length; j++) {
			if (listaNotas[j] > 4) {
				aprobadosMedia += listaNotas[j];
			}
		}
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

		aprobadosMedia = aprobadosMedia / aprobados;
		System.out.println("Total de alumnos suspensos: " + suspensos);
		System.out.println("Nota media aprobados: " + aprobadosMedia);
	}
}
