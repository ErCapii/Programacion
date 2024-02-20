package Tema4CarritoCompraSet;

public class Ropa extends Articulos {

	private String talla;
	private String color;

	public Ropa(String descripcion, Integer precio, String talla, String color) {
		super(descripcion, precio);
		this.talla = talla;
		this.color = color;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Articulo " + descripcion + ", precio " + precio + "€ talla " + talla + ", color " + color;
	}

}
