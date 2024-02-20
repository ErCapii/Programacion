package Tema4Telefonos;

public class Fijo extends General{

	private String direccion;

	public Fijo(Integer numero, String direccion) {
		super(numero);
		this.direccion = direccion;
	}
}
