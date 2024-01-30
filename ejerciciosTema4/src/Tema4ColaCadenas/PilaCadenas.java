package Tema4ColaCadenas;

import java.util.ArrayList;
import java.util.List;

public class PilaCadenas {
	
	List<String> list;
	
	
	public PilaCadenas() {
		list = new ArrayList<>();
	}
	public void añadirCadena(String cadena) {
		list.add(cadena);
	}
	public String sacarCadena() {
		return list.remove(list.size() - 1);
	}
	public Integer getTamaño() {
		return list.size();
	}
	@Override
	public String toString() {
		return list.toString();
	}
	
}
