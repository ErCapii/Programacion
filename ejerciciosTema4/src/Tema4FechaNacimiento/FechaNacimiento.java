package Tema4FechaNacimiento;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FechaNacimiento {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	LocalDate fecha;
	String fechaCadena="09/09/2000";
//	do{
//		System.out.println("Dime tu fecha de nacimiento");
//		fechaCadena = sc.nextLine();
//	}while(isFormatoIncorrecto(fechaCadena));
	
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	fecha = LocalDate.parse(fechaCadena, formato);
	
	if(fecha.isLeapYear()) {
		System.out.println("Naciste en bisiesto");
	}else
	System.out.println("No naciste en bisiesto");
	
	System.out.println(fecha.getDayOfWeek());

	Period periodo = fecha.until(LocalDate.now());
	System.out.println(periodo.getYears());
	
	LocalDate fechaMas100 = fecha.plusYears(100);
	periodo = LocalDate.now().until(fechaMas100);
	System.out.println("Te quedan "+ periodo.getYears() + " años " + periodo.getMonths()+" meses " + periodo.getDays()+ " dias" );
	
	LocalTime hora = LocalTime.now();
	System.out.println(hora.getHour()+":"+hora.getMinute()+":"+hora.getSecond());
	
	
	
	
	
}
private static boolean isFormatoIncorrecto(String fecha) {
	String[] partes = fecha.split("/");
	if (partes.length != 3) {
		return true;
	}
	Integer dia = Integer.parseInt(partes[0]);
	Integer mes = Integer.parseInt(partes[1]);
	Integer año = Integer.parseInt(partes[2]);
	
	return(dia>31 && dia<1 || mes>12 && mes<1 || año<1900 && año>2024);
	
	
}
}
