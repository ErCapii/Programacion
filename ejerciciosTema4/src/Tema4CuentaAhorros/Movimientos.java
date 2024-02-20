package Tema4CuentaAhorros;

import java.math.BigDecimal;
import java.text.Format;
import java.time.LocalDate;

public abstract class Movimientos {
	private BigDecimal importe;
	protected LocalDate fecha;
	private String tipo;

	public BigDecimal getImporte() {
		return importe;
	}

	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void actualizarFecha() {

		fecha = LocalDate.now();
	}

	protected abstract BigDecimal getImporteFormat();

}
