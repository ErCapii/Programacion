package ejerciciospracticosderepaso;

import java.util.Random;
import java.util.Scanner;

public class EJERCICIOSS23 {
public static void main(String[] args) {
	Random random = new Random();
	Scanner sc = new Scanner(System.in);
	long contador=0;
	long vueltas;
	do {
	System.out.println("Cuantas veces quieres tirar el dado?");
	vueltas=sc.nextInt();
	if (vueltas<=0) {
		System.out.println("No puede ser 0 o menor de 0");
	}
	}while (vueltas<=0);
		
	long dado1=0;
	long dado2=0;
	long dado3=0;
	long dado4=0;
	long dado5=0;
	long dado6=0;
	do {
		Integer dado=random.nextInt(0,7);
	switch (dado) {
	case 1:
		dado1++;
		break;
	case 2: 
		dado2++;
		break;
	case 3: 
		dado3++;
		break;
	case 4: 
		dado4++;
		break;
	case 5: 
		dado5++;
		break;
	case 6: 
		dado6++;
		break;
	default:
	}		
		contador++;
	}while (vueltas!=contador);
	System.out.println("El 1 a salido "+dado1+" veces");		
	System.out.println("El 2 a salido "+dado2+" veces");		
	System.out.println("El 3 a salido "+dado3+" veces");		
	System.out.println("El 4 a salido "+dado4+" veces");		
	System.out.println("El 5 a salido "+dado5+" veces");		
	System.out.println("El 6 a salido "+dado6+" veces");
	sc.close();
}
}
