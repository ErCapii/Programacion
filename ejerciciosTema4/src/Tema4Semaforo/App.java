package Tema4Semaforo;

import java.util.Iterator;

public class App {
	public static void main(String[] args) {

		Semaforo semaforo = new Semaforo();
		System.out.println(semaforo + " " + 1);
		semaforo.setColor("red");
		System.out.println(semaforo + " " + 2);
		semaforo.setColor("verde");
		System.out.println(semaforo + " " + 3);
		semaforo.setParpadeando(true);
		System.out.println(semaforo + " " + 4);
		semaforo.setColor("ambar");
		System.out.println(semaforo + " " + 5);
		semaforo.setParpadeando(true);
		System.out.println(semaforo + " " + 6);
		for (int i = 0; i < 5; i++) {
			semaforo.cambiarEstado();
			System.out.println(semaforo + " bucle " + (i + 1));
		}
		Semaforo semaforo2 = new Semaforo();
		semaforo2.setColor(semaforo.getColor());
		semaforo2.setParpadeando(semaforo.getParpadeando());
		System.out.println("1º " + semaforo + " 2º " + semaforo2);

	}
}
