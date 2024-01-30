package Tema4Peliculas;

import java.util.ArrayList;
import java.util.List;

public class Peliculas {

	private String titulo;
	private Integer añoEstreno;
	private List<Actor> listaActores;
	private Guionista guionista;
	private Director director;

		
	public Peliculas() {
		super();
		this.listaActores = new ArrayList<Actor>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getAñoEstreno() {
		return añoEstreno;
	}

	public void setAñoEstreno(Integer añoEstreno) {
		this.añoEstreno = añoEstreno;
	}

	public List<Actor> getListaActores() {
		return listaActores;
	}

	public void setListaActores(Actor listaActores) {
		this.listaActores.add(listaActores);
	}

	public Guionista getGuionista() {
		return guionista;
	}

	public void setGuionista(Guionista guionista) {
		this.guionista = guionista;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "titulo " + titulo + ", añoEstreno " + añoEstreno + ", listaActores " + listaActores
				+ " guionista " + guionista + ", director " + director;
	}

}
