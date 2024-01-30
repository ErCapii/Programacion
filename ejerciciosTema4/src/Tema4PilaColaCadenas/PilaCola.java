package Tema4PilaColaCadenas;

import java.util.ArrayList;
import java.util.List;

public class PilaCola<E> {
	private List<E> lista;
	private Boolean modoPila;
	private Boolean modoCola;

	public PilaCola() {
		this.lista = new ArrayList<>();
		this.modoCola = true;
		this.modoPila = false;
	}

	public void setModoPila() {
		modoPila = true;
		modoCola = false;
	}

	public void setModoCola() {
		modoCola = true;
		modoPila = false;
	}

	public void añadirCadena(E cadena) {
		lista.add(cadena);
	}

	public E sacarCadena() {
		if (lista.isEmpty()) {
			return null;
		} else if (modoPila) {
			return lista.remove(lista.size() - 1);
		} else if (modoCola) {
			return lista.remove(0);

		}
		return null;

	}

	public Integer getTamaño() {
		return lista.size();
	}

	@Override
	public String toString() {
		return lista.toString();
	}
}
