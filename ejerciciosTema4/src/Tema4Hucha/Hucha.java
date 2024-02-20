package Tema4Hucha;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Hucha {
	BigDecimal ahorros;
	
	
	public Hucha() {
		super();
		this.ahorros = BigDecimal.ZERO;
	}

	public BigDecimal meterDinero(BigDecimal dinero) {
		ahorros=ahorros.add(dinero);
		return redondeo(ahorros);
	}
	
	public BigDecimal sacarDinero(BigDecimal dinero) {
		
		if(ahorros.compareTo(dinero) < 0) {
			BigDecimal saquito = ahorros;
			ahorros = BigDecimal.ZERO;
			return saquito.setScale(2,RoundingMode.HALF_EVEN);
		}
		ahorros = ahorros.subtract(dinero);
		return redondeo(ahorros);
	}
	public BigDecimal contarDinero() {
		
		return redondeo(ahorros);
	}
	public BigDecimal romperHucha() {
		BigDecimal saquito = ahorros;
		ahorros = BigDecimal.ZERO;
		return saquito.setScale(2,RoundingMode.HALF_EVEN);
	}

	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat("#,##0.00€");
		return format.format(ahorros.setScale(2,RoundingMode.HALF_EVEN));
	}
	public BigDecimal redondeo(BigDecimal dinero) {
		return ahorros = dinero.setScale(2,RoundingMode.HALF_EVEN);
	}
}
