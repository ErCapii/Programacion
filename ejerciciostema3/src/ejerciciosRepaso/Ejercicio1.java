package ejerciciosRepaso;

import java.util.Scanner;

public class Ejercicio1 {
	public static Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer seleccion;
		Boolean salir=true;
		do {
			System.out.println("Que quieres saber?");
			System.out.println("1 Alumnos Suspendidos");
			System.out.println("2 Media Aprovados");
			System.out.println("3 Posicion Notas");
			System.out.println("4 Todos aprobados");
			System.out.println("5 Pares Multriplidos");
			System.out.println("0 Salir");
			seleccion = sc.nextInt();
			System.out.println();
			if (seleccion == 1) {
				System.out.println("Total de alumnos suspensos: " + suspensos());
			} else if (seleccion == 2) {
				System.out.println("Nota media aprobados: " + aprobadosMedia());
			} else if (seleccion == 3) {
				System.out.println("Que nota buscas?");
				Integer notaBuscada = sc.nextInt();
				contadorNotas(notaBuscada);
				contadorNotasMayores(notaBuscada);
				String notas = notas(notaBuscada);
				System.out.println(notas);
			} else if (seleccion == 4) {
				System.out.println(todosAprobados());
			} else if (seleccion == 5) {
				System.out.println(multiplo());
			} else if (seleccion == 0) {
				salir=false;
			}else {
			System.out.println("Elige un opcion valida");
			}
			System.out.println();
		} while (salir);
		sc.close();
	}

	public static Integer suspensos() {

		Integer suspensos = 0;
		for (int i = 0; i < listaNotas.length; i++) {
			if (listaNotas[i] < 5) {
				suspensos++;
			}
		}
		return suspensos;
	}

	public static Integer aprobados() {
		Integer aprobados = 0;
		for (int i = 0; i < listaNotas.length; i++) {
			if (listaNotas[i] < 5) {
				aprobados++;
			}
		}
		return aprobados;
	}

	public static Integer aprobadosMedia() {
		Integer aprobadosMedia = 0;

		for (int j = 0; j < listaNotas.length; j++) {
			if (listaNotas[j] > 4) {
				aprobadosMedia += listaNotas[j];
			}
		}
		aprobadosMedia = aprobadosMedia / aprobados();
		return aprobadosMedia;
	}

	public static Integer contadorNotas(Integer notaBuscada) {
		int contadorNotas = 0;
		for (int i = 0; i < listaNotas.length; i++) {
			if (listaNotas[i] == notaBuscada) {
				contadorNotas++;
			}

		}
		return contadorNotas;
	}

	public static Integer contadorNotasMayores(Integer notaBuscada) {
		int contadorNotasMayores = 0;
		for (int i = 0; i < listaNotas.length; i++) {
			if (listaNotas[i] > notaBuscada) {
				contadorNotasMayores++;
			}
		}
		return contadorNotasMayores;
	}

	public static String notas(Integer notaBuscada) {
		Integer[] posicionNota = new Integer[contadorNotas(notaBuscada)];
		for (int i = 0, j = 0; i < listaNotas.length; i++) {
			if (listaNotas[i] == notaBuscada) {
				posicionNota[j] = i + 1;
				j++;
			}
		}
		String notas = "";
		String x = "";
		if (contadorNotas(notaBuscada) > 0) {
			for (int i = 0; i < posicionNota.length; i++) {
				notas = notas + posicionNota[i].toString() + ", ";
			}
			x = "La nota buscada existe y esta en la posicion/es " + notas + " y hay "
					+ contadorNotasMayores(notaBuscada) + " mayores a la indicada";
		} else {
			x = "La nota buscada no existe";
		}
		return x;
	}

	public static String todosAprobados() {
		String listaModificada = "";
		for (int i = 0; i < listaNotas.length; i++) {
			if (listaNotas[i] < 5) {
				listaNotas[i] = 5;
			}
			listaModificada += listaNotas[i].toString() + ", ";
		}
		return listaModificada;
	}

	public static String multiplo() {
		String listaModificada = "";
		for (int i = 0; i < listaNotas.length; i++) {
			Integer resto = i % 2;
			if (resto == 0) {
				listaNotas[i] = listaNotas[i] * 2;
			}
			listaModificada += listaNotas[i].toString() + ", ";
		}
		return listaModificada;
	}
}
