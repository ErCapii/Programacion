package Tema4Curso;

import java.util.Scanner;

public class AppAlumno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Alumno[] arrayAlumno = new Alumno[3];

		Curso curso = new Curso("1", "DAM-DAW", arrayAlumno.length);
		Boolean salir = false;
		for (int i = 0; i < arrayAlumno.length; i++) {
			do {
				do {
					System.out.println("Dni del alumno ");
					arrayAlumno[i] = new Alumno(sc.nextLine());
					curso.addAlumno(arrayAlumno[i]);
					;
				} while (arrayAlumno[i].validarDNI());
				System.out.println("Nombre del alumno ");
				arrayAlumno[i].setNombre(sc.nextLine());
				System.out.println("Edad del alumno ");
				arrayAlumno[i].setEdad(sc.nextInt());
				System.out.println("Nota del alumno ");
				arrayAlumno[i].setNota(sc.nextInt());
				arrayAlumno[i].setCurso(curso);
				sc.nextLine();
				if (arrayAlumno[i].validar()) {
					System.out.println("Alumno " + (i + 1));
					salir = true;
				} else {
					salir = false;
				}
			} while (salir);
		}

		if (arrayAlumno[0].equals(arrayAlumno[1]) || arrayAlumno[0].equals(arrayAlumno[2])
				|| arrayAlumno[1].equals(arrayAlumno[2])) {
			System.out.println("Hay alumnos repetidos");
		} else {
			System.out.println("No hay ningún alumno repetido");
		}

		Boolean imprimir = true;
		for (int j = 0; j < arrayAlumno.length; j++) {

			for (int i = 0; i < arrayAlumno.length; i++) {
				if (j != i) {
					if (arrayAlumno[j].getDni().equals(arrayAlumno[i].getDni())) {
						System.out.println("Error en el DNI");
						imprimir = false;
						break;
					}
				}
			}
		}
		System.out.println("Datos de los alumnos");
		if (imprimir) {
			for (int i = 0; i < arrayAlumno.length; i++) {
				System.out.println("/t" + arrayAlumno[i]);
			}
		}

		sc.close();
	}

}
