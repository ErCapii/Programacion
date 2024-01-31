package Tema4VideoJuego;

public class App {
	public static void main(String[] args) {

		Jugador jugador1 = new Jugador("alex");
		Asesinos a1 = new Asesinos("Carlos", "001");
		Asesinos a2 = new Asesinos("Raul", "002");
		Asesinos a3 = new Asesinos("Fran", "003");
		jugador1.setequipo(a1);
		jugador1.setequipo(a2);
		jugador1.setequipo(a3);
		Parasitos p1 = new Parasitos("Blas", "B69");
		System.out.println("Daño " + p1.getDaño() + " cada " + p1.getDañoXSegundo());
		jugador1.setequipo(p1);
		System.out.println(jugador1.getVidaTotal());
		jugador1.setequipo(p1);
		System.out.println(jugador1.getequipo());
		Parasitos p2 = new Parasitos("Blasa", "B696");
		Parasitos p3 = new Parasitos("Blasasa", "B6969");
		jugador1.setequipo(p2);
		jugador1.setequipo(p3);
		System.out.println(jugador1.getequipo());
		System.out.println(jugador1.getVidaTotal());
		
		
		
	}
}
