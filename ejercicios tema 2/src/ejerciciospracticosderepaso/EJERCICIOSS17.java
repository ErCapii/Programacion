package ejerciciospracticosderepaso;

import java.util.Scanner;

public class EJERCICIOSS17 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Integer numero=0;
	Integer resultado=0;	
	Integer numero1=1;	
	Integer acumulador=0;
	Integer contador=0;
	do {
		System.out.println("Dime un numero mayor que 2");
		numero=sc.nextInt();
		
		if (numero<3) {
			System.out.println("No es valido");
		}
	}while (numero<3);
	System.out.print("0, ");
	System.out.print("1, ");
	do {
		
			resultado=numero1+acumulador;
			System.out.print(resultado+", ");
			acumulador=numero1;
			numero1=resultado;
			
		contador++;
	
	}while (!(contador==numero-2));
	System.out.println();
	System.out.println("listo");
	sc.close();	}
}
