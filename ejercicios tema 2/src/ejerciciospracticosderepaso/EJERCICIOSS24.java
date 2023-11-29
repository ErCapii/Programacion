package ejerciciospracticosderepaso;

import java.util.Scanner;

public class EJERCICIOSS24 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Integer numero=0;
	Integer resultado=0;
	Integer numero2=0;
	
	do {
		System.out.println("Dame un numero mayor que 0");
		numero=sc.nextInt();
		if (numero<=0) {
			System.out.println("Numero no valido");
		}
	}
	while (numero<=0); 
	do {
	Integer impar=  numero2 %2;
	if (impar==0) {
		
	}else {
		resultado=resultado+numero2;
	}
	numero2++;
		
	}while(numero>=numero2);
	System.out.println(resultado);
		
	sc.close();
}
}
