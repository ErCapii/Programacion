package Tema4ColaCadenas;

import java.util.ArrayList;
import java.util.List;

public class ColaCadenas {
	private List<String> lista;

	public ColaCadenas() {
		this.lista = new ArrayList<String>();
		;
	}

	public void añadirCadena(String cadena) {
		lista.add(cadena);
	}

	public String sacarCadena() {
		if (lista.isEmpty()) {
			return null;
		}
		return lista.remove(0);

	}

	public Integer getTamaño() {
		return lista.size();
	}

	@Override
	public String toString() {
		return lista.toString();
	}
	
}
