package ejerciciosRepaso;

import java.util.Scanner;

public class ejercici10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantos alumnos hay en clase?");
		int numero = sc.nextInt();
		sc.nextLine();
		int contador = 1;
		int contador2 = 1;
		int mediaAlumnos=0;
		String[] nombres = new String[numero];
		Integer[][] notas = new Integer[numero][3];

		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Cual es el nombre del alumno " + contador);
			String nombre = sc.nextLine();
			nombres[i] = nombre;
			contador++;
			contador2=1;
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println("¿Cual es la nota del examen " + contador2);
				Integer nota = sc.nextInt();
				notas[i][j] = nota;
				contador2++;
				
			}
			sc.nextLine();
			System.out.println();
		}
		System.out.println("Listado de notas");
		for (int i = 0; i < nombres.length; i++) {
			System.out.print("Alumno: "+nombres[i]);
			int media=0;
			for (int j = 0; j < notas[i].length; j++) {
				media+=notas[i][j];
			}
			media=media/3;
			System.out.println(" - Nota media: "+media);
			mediaAlumnos+=media;
		}
		mediaAlumnos=mediaAlumnos/numero;
		System.out.println("Media de los alumnos: "+ mediaAlumnos);
	}
}
