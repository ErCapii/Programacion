package Tema4Telefonos;

public class app {
public static void main(String[] args) {
	Fijo fijo = new Fijo(954954954, "Ceu");
	Movil movil = new Movil(654654654, 23423,234324);
	
	System.out.println(fijo.consultarNumero());
	System.out.println(movil.consultarNumero());
	movil.marcar(654654654);
	movil.marcar(601601610);
	movil.colgar();
	movil.colgar();
	System.out.println(movil);
	
}
}
