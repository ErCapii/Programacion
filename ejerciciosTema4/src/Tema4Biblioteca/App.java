package Tema4Biblioteca;

public class App {
public static void main(String[] args) {
	//1
	Biblioteca b1 = new Biblioteca();
	Libros l1 = new Libros(1234, "Gonzalo", "AvPag", 2015);
	b1.addArticulo(l1);
	Revistas r1 = new Revistas(5678, "Roberto", "RePAg", 2014);
	b1.addArticulo(r1);
	CD c1 = new CD(9012, "Martinez", "AlgunPag", 2013);
	b1.addArticulo(c1);
	//2
	l1.prestar();
	c1.prestar();
	//3
	l1.retirarParaConsultar();
	r1.retirarParaConsultar();
	//4
	System.out.println(l1);
	System.out.println(r1);
	System.out.println(c1);
	//5
	l1.devolver();
	l1.retirarParaConsultar();
	//6
	l1.prestar();
	//7
	System.out.println(l1);
	System.out.println(r1);
	System.out.println(c1);
	//8
	c1.devolver();
	l1.terminarConsulta();
	r1.terminarConsulta();
	//9
	System.out.println(l1.estaPrestado()+ ", "+l1.estaConsultando());
	System.out.println(r1.estaConsultando());
	System.out.println(c1.estaPrestado());
	
}
}
