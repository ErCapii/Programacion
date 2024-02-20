package Tema4Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<ArticulosBiblio> articulo;
	
	

	public Biblioteca() {
		super();
		articulo = new ArrayList<>();
	}
	public List<ArticulosBiblio> getBiblioteca() {
		return articulo;
	}
	public void setBiblioteca(List<ArticulosBiblio> articulo) {
		this.articulo = articulo;
	}
	public void addArticulo(ArticulosBiblio articulo) {
		this.articulo.add(articulo);
	
	}



	



}
