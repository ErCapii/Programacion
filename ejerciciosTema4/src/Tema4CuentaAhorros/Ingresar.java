package Tema4CuentaAhorros;

import java.math.BigDecimal;

public class Ingresar extends Movimientos {

	private String descripcion;

	public Ingresar(BigDecimal importe, String descripcion) {
		this.descripcion = descripcion;
		setTipo("I");
		actualizarFecha();
		setImporte(importe);
	}

	@Override
	public String toString() {
		return getTipo() + "- " + getFecha() + " - " + getImporte() + " - " + descripcion;
	}

	@Override
	protected BigDecimal getImporteFormat() {
		// TODO Auto-generated method stub
		return getImporte().plus();
	}

}
