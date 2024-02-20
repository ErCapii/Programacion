package Tema4Hucha;

import java.math.BigDecimal;

public class app {
	public static void main(String[] args) {
		
		Hucha hucha = new Hucha();
		BigDecimal dinero = new BigDecimal("100");
		System.out.println(hucha);
		hucha.meterDinero(dinero);
		System.out.println(hucha);
		dinero=new BigDecimal("50.501");
		hucha.meterDinero(dinero);
		System.out.println(hucha);
		dinero=new BigDecimal("20.5");
		hucha.sacarDinero(dinero);
		System.out.println(hucha);
		dinero=new BigDecimal("200");
		hucha.sacarDinero(dinero);
		System.out.println(hucha);
		dinero=new BigDecimal("130");
		hucha.meterDinero(dinero);
		System.out.println(hucha);
		hucha.meterDinero(hucha.contarDinero());
		System.out.println(hucha);
		hucha.meterDinero(hucha.romperHucha());
		System.out.println(hucha);
		
			
		
	}
}
