package Tema4Libreria;

public class App {
public static void main(String[] args) {
	Libreria libreria = new Libreria("Avda. de los sueños perdidos, 89", 954696954);
	LibroFisico lf1 = new LibroFisico("Milanesa", "Cervantes", 2012, 346,10,25,150);
	LibroFisico lf2 = new LibroFisico("Millonanesa", "Rajoi", 2003, 562,12,24,200);
	LibroDigital ld1 = new LibroDigital("Peru", "Alguien", 1995, 234);
	LibroDigital ld2 = new LibroDigital("Pero no es", "Apu", 1975, 768);
	libreria.addLibreria(lf1);
	libreria.addLibreria(lf2);
	libreria.addLibreria(ld1);
	libreria.addLibreria(ld2);
	
	System.out.println(libreria.obtenerPesoTotalDeLibros());
	System.out.println(libreria.obtenerLibroMasAntiguo());
	System.out.println(libreria.NumPaginasMedio());
	System.out.println(libreria);
}
}
