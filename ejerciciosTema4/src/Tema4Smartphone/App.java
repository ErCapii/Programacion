package Tema4Smartphone;

import java.math.BigDecimal;

public class App {
public static void main(String[] args) {
	
	Smartphone movil = new Smartphone();
	Smartphone movil4 = new Smartphone();
	Smartphone movil2 = new Smartphone("Telefono2");
	Smartphone movil3 = new Smartphone("Telefono3","Alcatel","311");
	
	System.out.println(movil);
	System.out.println(movil2);
	System.out.println(movil3);
	
	movil.establecerFabricacion(2015);
	movil2.establecerFabricacion(2013);
	movil3.establecerFabricacion(2014);
	
	System.out.println(movil.getEdad()+" años");
	System.out.println(movil2.getEdad()+" años");
	System.out.println(movil3.getEdad()+" años");
	
	movil.setPrecio(new BigDecimal(2000));
	movil2.setPrecio(new BigDecimal(1000));
	movil3.setPrecio(new BigDecimal(3000));
	
	System.out.println(movil.getPrecioMasiva() + "€");
	System.out.println(movil2.getPrecioMasiva() + "€");
	System.out.println(movil3.getPrecioMasiva() + "€");
	
	System.out.println(movil.isAltaGama(new BigDecimal(2000)));
	System.out.println(movil2.isAltaGama(new BigDecimal(2000)));
	System.out.println(movil3.isAltaGama(new BigDecimal(2000)));
	
	System.out.println(movil.isGratis());
	System.out.println(movil2.isGratis());
	System.out.println(movil3.isGratis());
	System.out.println(movil4.isGratis());
	
	movil.rebajar();
	movil2.rebajar();
	movil3.rebajar();
	
	System.out.println(movil.getPrecio());
	System.out.println(movil2.getPrecio());
	System.out.println(movil3.getPrecio());
	
	System.out.println(movil.isDatosCompletos());
	System.out.println(movil2.isDatosCompletos());
	System.out.println(movil3.isDatosCompletos());
	
	movil.cambiarMarcaModelo("iphone", "15");
	movil2.cambiarMarcaModelo("samsung", "15");
	movil3.cambiarMarcaModelo("alcatel", "300");
	
	movil.desactivarS();
	
	System.out.println(movil);
	System.out.println(movil2);
	System.out.println(movil3);
}
}
