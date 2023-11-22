package ejerciciosAvanzados;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class EJERCICIO1 {
public static void main(String[] args) {
	Random rm = new Random();
	Scanner sc = new Scanner(System.in);
	System.out.println("Cuantas veces tiras el dado");
	Integer tiradas= sc.nextInt();
	Integer[] dado1= new Integer[tiradas];
	Integer[] dado2= new Integer[tiradas];
	
	for (int i = 0; i < dado2.length; i++) {
		Integer numrm=rm.nextInt(1,7);
		dado1[i]=numrm;
		Integer numrm2=rm.nextInt(1,7);
		dado2[i]=numrm2;
	}
	Integer[] media= new Integer[] {0,0,0,0,0,0,0,0,0,0,0};
	for (int i = 0; i < dado1.length; i++) {
		Integer suma=dado1[i]+dado2[i];
		switch(suma) {
		case 2:
				media[0]++;
			break;
		case 3:
				media[1]++;
			break;
		case 4:
				media[2]++;
			break;
		case 5:
				media[3]++;
			break;
		case 6:
				media[4]++;
			break;
		case 7:
				media[5]++;
			break;
		case 8:
				media[6]++;
			break;
		case 9:
				media[7]++;
			break;
		case 10:
				media[8]++;
			break;
		case 11:
				media[9]++;
			break;
		case 12:
				media[10]++;
			break;
	
	}
		}
	for (int j = 0, l=2; j < media.length; j++, l++) {
		System.out.println("Ha salido un "+ l + " un "+ (media[j]*100)/tiradas+"% del total");
}
}
}
