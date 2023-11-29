package pruebas;

import java.util.Scanner;

public class pruebasgpt {
	public static void main(String[] args) {
		
		//Escribe un programa que tome la calificación de un estudiante como entrada 
		//y determine si ha aprobado (calificación mayor o igual a 60) o no.

		System.out.println("Dime tu nota del examen");
		Scanner sc = new Scanner(System.in);
		double nota = sc.nextDouble();
		
		double aprobado = 60;
		
		if (nota>=aprobado) {
			System.out.println("Estas aprobado");
		}
		else if (nota<aprobado) {
			System.out.println("Estas Suspendido");
		}
		sc.close();
		
		
	}
}
//Solucion chat gpt
//import java.util.Scanner;

//public class CalificacionAprobatoria {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Ingrese la calificación del estudiante: ");
//        int calificacion = scanner.nextInt();
//
//        if (calificacion >= 60) {
//            System.out.println("El estudiante ha aprobado.");
//       } else {
//           System.out.println("El estudiante ha reprobado.");
//        }
//
//        scanner.close();
//    }
//}