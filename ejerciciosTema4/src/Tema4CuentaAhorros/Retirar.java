package Tema4CuentaAhorros;

import java.math.BigDecimal;

public class Retirar extends Movimientos {

	public Retirar(BigDecimal importe) {
		setTipo("R");
		actualizarFecha();
		setImporte(importe);
	}

	@Override
	public String toString() {
		return getTipo() + "- " + getFecha() + " - " + getImporte();
	}

	@Override
	protected BigDecimal getImporteFormat() {
		// TODO Auto-generated method stub
		return getImporte().negate();
	}
}
