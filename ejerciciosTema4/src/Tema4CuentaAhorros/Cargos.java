package Tema4CuentaAhorros;

import java.math.BigDecimal;

public class Cargos extends Movimientos {

	private String cif;

	public Cargos(BigDecimal importe, String cif) {
		this.cif = cif;
		setTipo("C");
		actualizarFecha();
		setImporte(importe);
	}

	@Override
	public String toString() {
		return getTipo() + "- " + getFecha() + " - " + getImporte() + " - " + cif;
	}

	@Override
	protected BigDecimal getImporteFormat() {
		// TODO Auto-generated method stub
		return getImporte().negate();

	}

}
