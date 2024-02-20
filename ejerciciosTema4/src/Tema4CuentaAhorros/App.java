package Tema4CuentaAhorros;

import java.math.BigDecimal;

public class App {
public static void main(String[] args) {
	CuentaAhorros cuenta = new CuentaAhorros(new BigDecimal("12345678901234567890"));
	
	System.out.println(cuenta.mostrarAhorros());
	Cargos c1 = new Cargos(new BigDecimal("200"), "D12345678");
	cuenta.registrarMovimiento(c1);
	Cargos c2 = new Cargos(new BigDecimal("500"), "F12345678");
	cuenta.registrarMovimiento(c2);
	Ingresar i1 = new Ingresar(new BigDecimal("1000"), "herencia");
	cuenta.registrarMovimiento(i1);
	Ingresar i2 = new Ingresar(new BigDecimal("2000"), "sorteo");
	cuenta.registrarMovimiento(i2);
	Retirar r1 = new Retirar(new BigDecimal("300"));
	cuenta.registrarMovimiento(r1);
	System.out.println(cuenta.mostrarAhorros());
	System.out.println(cuenta.toStringMovimientos());
	System.out.println(cuenta.toStringCargos());
	System.out.println(cuenta.toStringIngresos());
	System.out.println(cuenta.toStringRetiros());
	
	
	
}
}
