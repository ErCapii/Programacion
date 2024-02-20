package Tema4Smartphone;

import java.math.BigDecimal;

public class Smartphone {

	private String marca;
	private String modelo;
	private String imei;
	private BigDecimal precio;
	private Integer añoFabriacion;
	private Boolean activo;

	public Smartphone() {
		super();
		this.precio = BigDecimal.ZERO;
		this.activo = true;
	}

	public Smartphone(String imei) {
		this.imei = imei;
		this.precio = BigDecimal.ZERO;
		this.activo = true;
	}

	public Smartphone(String imei,String marca, String modelo ) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.imei = imei;
		this.precio = BigDecimal.ZERO;
		this.activo = true;
	}

	public void activarS() {
		activo = true;
	}

	public void desactivarS() {
		activo = false;
	}

	public Integer getEdad() {
		return añoFabriacion - 2000;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public void cambiarMarcaModelo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public void establecerFabricacion(Integer año) {
		añoFabriacion = año;
	}

	public BigDecimal getPrecioMasiva() {
		BigDecimal iva = new BigDecimal("1.21");
		return precio.multiply(iva);
	}

	public Boolean isAltaGama(BigDecimal precio) {

		return this.precio.compareTo(precio) > 0;
	}

	public Boolean isDatosCompletos() {

		return !(imei == null || imei.isEmpty() || imei.isBlank() || precio == null);
	}

	public String isGratis() {

		if (precio.equals(BigDecimal.ZERO)) {
			return "Es gratis";
		}
		return "No es gratis";
	}

	public void rebajar() {
		precio = precio.subtract(new BigDecimal("10"));
	}

	@Override
	public String toString() {
		if (activo) {
			return "marca: " + marca + " (" + modelo + ")";
		}
		return "marca: " + marca + " (" + modelo + ") - Inactivo";
	}

}
