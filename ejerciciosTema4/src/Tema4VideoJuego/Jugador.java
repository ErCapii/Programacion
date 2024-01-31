package Tema4VideoJuego;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
	private String nombre;
	protected List<Personaje> equipo;

	public Jugador(String nombre) {
		super();
		this.nombre=nombre;
		this.equipo = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getequipo() {
		return equipo.toString();
	}

	public void setequipo(Personaje personaje) {
		if(equipo.size() >=5 || equipo.contains(personaje)) {
			
		}else {
			equipo.add(personaje);
		}
	}

	@Override
	public String toString() {
		return "Jugador nombre " + nombre + ", equipo " + equipo;
	}
	public Integer getVidaTotal() {
		Integer vida = 0;
		for (int i = 0; i < equipo.size(); i++) {
			vida+=equipo.get(i).getVida();
		}
		return vida;
	}
}
