package Tema4Semaforo;

import java.util.Objects;

public class Semaforo {
	public static final String ROJO = "rojo";
	public static final String VERDE = "verde";
	public static final String AMBAR = "ambar";
	private String color;
	private Boolean parpadeando;

	public Semaforo() {

		this.color = ROJO;
		this.parpadeando = false;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (color.equals(ROJO) || color.equals(VERDE) || color.equals(AMBAR)) {
			this.color = color;
		}
	}

	public Boolean getParpadeando() {
		return parpadeando;
	}

	public void setParpadeando(Boolean parpadeando) {
		if (parpadeando && !color.equals(AMBAR)) {
		} else
			this.parpadeando = parpadeando;
	}

	@Override
	public String toString() {
		if (color.equals(AMBAR) && parpadeando) {
			
			return "Semaforo en " + color + " parpadeando";
		}else
			return "Semaforo en " + color;
		

		
	}
	

	public void cambiarEstado() {
		if (color.equals(ROJO)) {
			color = VERDE;
		} else if (color.equals(VERDE)) {
			color = AMBAR;
			parpadeando= true;
		} else if (color.equals(AMBAR) && parpadeando == true) {
			parpadeando = false;
		} else if (color.equals(AMBAR) && parpadeando == false) {
			color = ROJO;
		}
	}
}
