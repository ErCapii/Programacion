package Tema4CarritoCompra;

public abstract class Articulos {
	protected String descripcion;
	protected Integer precio;

	public Articulos(String descripcion, Integer precio) {
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

}
