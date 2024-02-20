package Tema4CarritoCompraSet;

public class Libros extends Articulos {

	private String autor;

	public Libros(String descripcion, Integer precio, String autor) {
		super(descripcion, precio);
		this.autor = autor;

	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Articulo " + descripcion + ", precio " + precio + "€ autor " + autor;
	}

}
