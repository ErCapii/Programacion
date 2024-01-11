package Tema4Curso;

import java.util.Scanner;

public class AppProfesor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Persona profesor = new Persona();
		System.out.println("nombre profesor");
		profesor.setNombre(sc.nextLine());
		System.out.println("edad profesor");
		profesor.setEdad(sc.nextInt());
		sc.nextLine();
		System.out.println(profesor);

	}
}
