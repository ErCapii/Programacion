package Tema4Curso;

import java.util.Scanner;

public class AppAlumno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Alumno[] arrayAlumno = new Alumno[1];
		Curso curso = new Curso("1", "DAM-DAW");
		Boolean salir=false;
		for (int i = 0; i < arrayAlumno.length; i++) {
			do {
			do {
			System.out.println("Dni del alumno " + (i + 1));
			arrayAlumno[i] = new Alumno(sc.nextLine());
			}while(arrayAlumno[i].validarDNI());
			System.out.println("Nombre del alumno " + (i + 1));
			arrayAlumno[i].setNombre(sc.nextLine());
			System.out.println("Edad del alumno " + (i + 1));
			arrayAlumno[i].setEdad(sc.nextInt());
			System.out.println("Nota del alumno " + (i + 1));
			arrayAlumno[i].setNota(sc.nextInt());
			arrayAlumno[i].setCurso(curso);
			sc.nextLine();
			if (arrayAlumno[i].validar()) {
				System.out.println("Alumno "+(i+1));
				salir=true;
			}else
				salir=false;
			}while (salir);
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
		if (imprimir) {
			for (int i = 0; i < arrayAlumno.length; i++) {
				System.out.println(arrayAlumno[i]);
			}
		}

		sc.close();
	}
}
