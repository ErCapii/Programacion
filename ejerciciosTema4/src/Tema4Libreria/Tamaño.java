package Tema4Libreria;

public class Tamaño {

	private Integer ancho;
	private Integer largo;
	
	
	@Override
	public String toString() {
		return " ancho " + ancho + ", largo" + largo;
	}
	public Tamaño(Integer ancho, Integer largo) {
		super();
		this.ancho = ancho;
		this.largo = largo;
	}
	public Integer getAncho() {
		return ancho;
	}
	public void setAncho(Integer ancho) {
		this.ancho = ancho;
	}
	public Integer getLargo() {
		return largo;
	}
	public void setLargo(Integer largo) {
		this.largo = largo;
	}
	
	
}
