package Tema4Peliculas;

import java.util.ArrayList;
import java.util.List;

public class App {
public static void main(String[] args) {
	
		Actor actor1= new Actor();
		Actor actor2= new Actor();
		Actor actor3= new Actor();
		Actor actor4= new Actor();
		actor1.setNombre("Blas Blau");
		actor1.setNacionalidad("España");
		actor1.setAñoNacimiento(1983);
		actor2.setNombre("Laura Pozo");
		actor2.setNacionalidad("Italia");
		actor2.setAñoNacimiento(1981);
		actor3.setNombre("Marcel Cade");
		actor3.setNacionalidad("Suiza");
		actor3.setAñoNacimiento(2001);
		actor4.setNombre("Violeta Volo");
		actor4.setNacionalidad("Rusia");
		actor4.setAñoNacimiento(1999);
		
//		System.out.println(actor1);
//		System.out.println(actor2);
//		System.out.println(actor3);
//		System.out.println(actor4);
//		System.out.println();
		
		Director director = new Director();
		director.setNombre("Sara Marea");
		director.setNacionalidad("Portugal");
		director.setAñoNacimiento(1994);
		
//		System.out.println(director);
//		System.out.println();
		
		Guionista guionista1 = new Guionista();
		Guionista guionista2 = new Guionista();
		guionista1.setNombre("Marco Smith");
		guionista1.setNacionalidad("Reino unido");
		guionista1.setAñoNacimiento(1988);
		guionista2.setNombre("Cheng Shu");
		guionista2.setNacionalidad("China");
		guionista2.setAñoNacimiento(1977);
		
//		System.out.println(guionista1);
//		System.out.println(guionista2);
		
		Peliculas pelicula = new Peliculas();
		
		pelicula.setAñoEstreno(2027);
		pelicula.setDirector(director);
		pelicula.setGuionista(guionista1);
		pelicula.setListaActores(actor1);
		pelicula.setListaActores(actor2);
		pelicula.setTitulo("Do you know Joe Blas");
		
//		System.out.println(pelicula);
		
		Peliculas pelicula2 = new Peliculas();
		
		pelicula2.setAñoEstreno(2027);
		pelicula2.setDirector(director);
		pelicula2.setGuionista(guionista2);
		pelicula2.setListaActores(actor1);
		pelicula2.setListaActores(actor2);
		pelicula2.setListaActores(actor3);
		pelicula2.setListaActores(actor4);
		pelicula2.setTitulo("Muerte en la sombra");
		
		System.out.println(pelicula.getListaActores());
		System.out.println(guionista1.getSueldo()+ "€ nacido en "+ guionista1.getNacionalidad());
		
		pelicula2.getListaActores().remove(actor3);
		pelicula.setListaActores(actor3);
		
		System.out.println(pelicula.getListaActores());
		System.out.println(pelicula2.getListaActores());
		
		
		
}
}
