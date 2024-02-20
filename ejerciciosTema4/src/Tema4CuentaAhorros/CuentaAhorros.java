package Tema4CuentaAhorros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CuentaAhorros {

	private BigDecimal cuentaBancaria;
	protected List<Movimientos> movimientos;

	public CuentaAhorros(BigDecimal cuentaBancaria) {
		String cuenta = cuentaBancaria.toString();
		if(cuenta.length() == 20){
		this.cuentaBancaria = cuentaBancaria;
		}
		movimientos = new ArrayList<>();
	}
	
	
	public String mostrarAhorros() {
		BigDecimal total = BigDecimal.ZERO;
		if(movimientos.size() == 0) {
			return "0€";
		}
		for(int i=0; i < movimientos.size();i++) {
			total = total.add(movimientos.get(i).getImporteFormat());
		}
		DecimalFormat formato = new DecimalFormat("#,###.00€");
		return formato.format(total);
	}

	public void registrarMovimiento(Movimientos movimiento) {
		movimientos.add(movimiento);
	}
	public String toStringMovimientos(){
		return "movimientos " + movimientos;
	}
	public String toStringIngresos(){
		
		String ingreso= "Ingresos: ";
		for (int i = 0; i < movimientos.size(); i++) {
			if(movimientos.get(i).getTipo().equals("I")) {
				ingreso += movimientos.get(i).toString();
			}
		}
		return ingreso;
	}
	public String toStringRetiros(){
		String retiro= "Retiros: ";
		for (int i = 0; i < movimientos.size(); i++) {
			if(movimientos.get(i).getTipo().equals("R")) {
				retiro += movimientos.get(i).toString();
			}
		}
		return retiro;
	}
	public String toStringCargos(){
		String cargos= "Cargos: ";
		for (int i = 0; i < movimientos.size(); i++) {
			if(movimientos.get(i).getTipo().equals("C")) {
				cargos += movimientos.get(i).toString();
			}
		}
		return cargos;
	}
}
