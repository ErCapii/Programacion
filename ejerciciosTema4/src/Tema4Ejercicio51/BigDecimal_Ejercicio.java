package Tema4Ejercicio51;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class BigDecimal_Ejercicio {
public static void main(String[] args) {
	List<BigDecimal> listaNumeros = new ArrayList<BigDecimal>();
	
	BigDecimal numero1= new BigDecimal("1");
	listaNumeros.add(numero1);
	BigDecimal numero2= new BigDecimal("2");
	listaNumeros.add(numero2);
	BigDecimal numero3= new BigDecimal("3");
	listaNumeros.add(numero3);
	BigDecimal numero4= new BigDecimal("4");
	listaNumeros.add(numero4);
	BigDecimal numero5= new BigDecimal("5");
	listaNumeros.add(numero5);
	BigDecimal division = BigDecimal.ZERO;
	BigDecimal suma2;
	BigDecimal resultado = BigDecimal.ZERO;
	
	for (int i = 0; i < listaNumeros.size(); i++) {		
		resultado= resultado.add(listaNumeros.get(i)).setScale(1,RoundingMode.HALF_DOWN);
	}
	System.out.println(resultado);
	
	division=listaNumeros.get(0).divide(listaNumeros.get(1)).setScale(3,RoundingMode.HALF_UP);
	System.out.println(division);
	
	
	
	
}
}
