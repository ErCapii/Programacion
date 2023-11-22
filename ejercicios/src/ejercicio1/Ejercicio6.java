package ejercicio1;

import java.util.Scanner;

public class Ejercicio6 {
	//calcular iva
 public static void main(String[] args) {
	
	 System.out.println("Cual es el precio del articulo");
	 Scanner scanner = new Scanner(System.in);
	 double precio = scanner.nextDouble();
	 System.out.println("y cual es el precio sin iva?");
	 double iva = 0.21;
	 double PrecioSinIva = precio*iva;
	 scanner.close();
	 
	 
	 
	 System.out.println("el iva es de "+PrecioSinIva +"€ y el precio sin iva es "+ (precio-PrecioSinIva)+"€");
	 
	 
}
}
