package Tema4DeportesCeu;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Equipo equipoLocal = crearEquipo(sc,"Local");
		Equipo equipoVisitante = crearEquipo(sc,"Visitante");
		System.out.println(equipoLocal);
		System.out.println(equipoVisitante);
		
		Partido partido= new Partido();
		partido.setEquipoLocal(equipoLocal);
		partido.setEquipoVisitante(equipoVisitante);
		Resultado resultado = new Resultado();
		partido.setResultado(resultado);
		
		System.out.println("Goles locales");
		Integer golesL= sc.nextInt();
		System.out.println("Goles Visitantes");
		Integer golesV = sc.nextInt();
		resultado.setGolesLocales(golesL);
		resultado.setGolesVisitantes(golesV);
		System.out.println(partido);
		System.out.println("Equipo ganador");
		System.out.println(partido.getEquipoGanador());
		
		Jugador infiltrado = new Jugador("blas infiltrado", 99);
		equipoVisitante.getJugadores().add(infiltrado);
		Jugador ultimo = equipoLocal.getJugadores().get(equipoLocal.getJugadores().size()-1);
		equipoLocal.setCapitan(ultimo);
		
		sc.close();
		
		equipoLocal.setCompeticion("Liga Nacional");
		System.out.println(equipoLocal.getCompeticion());
		
		equipoVisitante.setCompeticion("Copa internacional");
		System.out.println(equipoLocal.getCompeticion());
		}

	
	
	
	
	
	private static Equipo crearEquipo(Scanner sc,String equipo) {
		System.out.println("Nombre del equipo "+ equipo);
		Equipo e = new Equipo(sc.nextLine());

		
		for (int i = 1; i <=3; i++) {
			System.out.println("Nombre del jugador "+ i);
			String nombre = sc.nextLine();
			System.out.println("numero del jugador");
			Integer numero = sc.nextInt();
			sc.nextLine();
			Jugador jugador = new Jugador(nombre, numero);
			e.getJugadores().add(jugador);
			if(i == 1) {
			e.setCapitan(jugador);
			}
		}
		return e;
	}
}
