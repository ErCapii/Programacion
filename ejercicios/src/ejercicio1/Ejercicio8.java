package ejercicio1;

import java.util.Scanner;

public class Ejercicio8 {
	//realiza variables
 public static void main(String[] args) {
	
	 System.out.println("Dime un numero");
	 Scanner scanner = new Scanner(System.in);
	 String A = scanner.nextLine();
	 
	 System.out.println("Dime un numero decimal");
	 Double B = scanner.nextDouble();
	 
	 System.out.println("Dime un numero entero");
	 Float C = scanner.nextFloat();
	 
	 Long x1 = Long.parseLong(A);
	 String x2 =B.toString();
	 Integer x3 = B.intValue();
	 Long x4  = C.longValue();
	 
	 scanner.close();
	 
	 System.out.println(x1);
	 System.out.println(x2);
	 System.out.println(x3);
	 System.out.println(x4);
}

	
	}

