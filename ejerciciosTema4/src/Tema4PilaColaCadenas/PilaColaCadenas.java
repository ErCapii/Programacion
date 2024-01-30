package Tema4PilaColaCadenas;

import java.util.ArrayList;
import java.util.List;

public class PilaColaCadenas {
	private List<String> lista;
	private Boolean modoPila;
	private Boolean modoCola;

	public PilaColaCadenas() {
		this.lista = new ArrayList<String>();
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

	public void añadirCadena(String cadena) {
		lista.add(cadena);
	}

	public String sacarCadena() {
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
