package ejerciciosavanzados;

import java.util.Scanner;

public class EJERCICIOSS1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Texto");
		String texto= sc.nextLine();
		Integer espacios=0;
		String textoescrito="";
		Integer x=0;
		String mayus="";
		Integer salir=0;
		do {
			if(espacios==0) {
			espacios=texto.indexOf(" ");
			
			textoescrito=texto.substring(x+1, espacios);
			mayus=texto.substring(x,x+1);
			x=espacios+1;
			mayus=mayus.toLowerCase();
			}else if (espacios==texto.lastIndexOf(" ")){
				espacios=texto.lastIndexOf(" ");
				
				textoescrito=texto.substring(espacios+2);
				mayus=texto.substring(espacios+1, espacios+2);
				mayus=mayus.toUpperCase();
				salir=1;
				
			}else {
				espacios=texto.indexOf(" ", espacios+1);
			
			textoescrito=texto.substring(x+1, espacios);
			mayus=texto.substring(x,x+1);
			x=espacios+1;
			mayus=mayus.toUpperCase();
			}
			System.out.print(mayus+(textoescrito));
		}while(salir!=1);
		sc.close();
	}
}
