package ejerciciosPrimeraTanda;

import java.util.Random;

public class ejercicio5 {
public static void main(String[] args) {
	Random rm=new Random();
	Integer numero1=rm.nextInt(0,11);
	Integer numero2=rm.nextInt(0,11);
	Integer sumas=sumar(numero1,numero2);
	System.out.println(sumas);
}
public static Integer sumar(Integer uno, Integer dos) {
	Integer sumas=uno+dos;
	return sumas;
}
}
