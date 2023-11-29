package ejerciciospracticosderepaso;

import java.util.Scanner;

public class EJERCICIOSS10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String web;
		Integer sep;
		Integer punto2;
		Integer punto1; 
		
		do {
		System.out.println("Dame una direccion web");
		web = sc.nextLine();
		if (!web.contains(".") || !web.startsWith("http://") && !web.startsWith("https://")) {
			System.out.println("Error");
		}
		}while (!web.contains(".") || !web.startsWith("http://") && !web.startsWith("https://"));
		sep = web.lastIndexOf("://");
		punto1=web.indexOf(".");
		punto2 = web.lastIndexOf(".");
		
		String protocolo = web.substring(0, sep + 3);
		String parte1 = web.substring(sep + 3, punto1);
		String parte2 = web.substring(punto1 + 1, punto2);
		String parte3 = web.substring(punto2 + 1);
		System.out.println(protocolo);
		System.out.println(parte1);
		System.out.println(parte2);
		System.out.println(parte3);
		sc.close();
	}
}