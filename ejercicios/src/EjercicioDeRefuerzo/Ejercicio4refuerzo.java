package EjercicioDeRefuerzo;

import java.util.Scanner;

public class Ejercicio4refuerzo {
	public static <Wait> void main(String[] args) {
		
		System.out.println("dime tu numero favorito");
		Scanner scan = new Scanner(System.in);
		Integer valor = scan.nextInt();
		
		scan.nextLine();
		System.out.println("dime tu ciudad favorita");
		
		String ciudad = scan.nextLine();
		scan.close();
		System.out.println("Tu numero favorito es "+ valor+ " y tu ciudad favorita es "+ ciudad );
		
		
		
	}
}
