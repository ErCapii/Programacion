package Tema4VideoJuego;

public class Parasitos extends Personaje{
	
	public Parasitos(String nombre, String codigo) {
		super(nombre,codigo);
		this.vida = 200;
		this.daño = 2;
		this.dañoXSegundo = 1;
	}
}
